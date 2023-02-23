package ai.kudi.agent.core.domain.repositories;

import ai.kudi.agent.core.domain.repositories.specs.Specs;
import p425j.p444e.AbstractC11688p;
/* loaded from: classes.dex */
public interface Repository<T> {
    void delete(Specs specs);

    void delete(Object obj);

    void deleteAll();

    void insert(Iterable iterable);

    void insert(Object obj);

    AbstractC11688p query(Specs specs);

    AbstractC11688p querySingle(Specs specs);

    void update(Object obj);
}
