package alexph90.springframework.sfgpetclinic.services.map;

import alexph90.springframework.sfgpetclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T t) {

        if (t != null) {
            if (t.getId() == null)
                t.setId(getNextId());

            map.put(t.getId(), t);
        } else {
            throw new RuntimeException("Object cannot be null!");
        }

        return t;
    }

    void delete(T t) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(t));
    }

    private Long getNextId() {

        try {
            return Collections.max(map.keySet()) + 1;
        } catch (NoSuchElementException e) {
            return 1L;
        }
    }

}
