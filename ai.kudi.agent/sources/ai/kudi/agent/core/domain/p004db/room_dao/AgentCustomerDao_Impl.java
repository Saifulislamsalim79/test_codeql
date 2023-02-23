package ai.kudi.agent.core.domain.p004db.room_dao;

import ai.kudi.agent.core.domain.room_entities.AgentCustomerEntity;
import androidx.lifecycle.LiveData;
import androidx.room.AbstractC1802o0;
import androidx.room.C1775g0;
import androidx.room.C1816r0;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
/* renamed from: ai.kudi.agent.core.domain.db.room_dao.AgentCustomerDao_Impl */
/* loaded from: classes.dex */
public final class AgentCustomerDao_Impl implements AgentCustomerDao {
    private final AbstractC1802o0 __db;

    public AgentCustomerDao_Impl(AbstractC1802o0 abstractC1802o0) {
        this.__db = abstractC1802o0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static List getRequiredConverters() {
        List $r0 = Collections.emptyList();
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.domain.p004db.room_dao.AgentCustomerDao
    public LiveData getAllCustomer() {
        final C1816r0 $r2 = C1816r0.m34466m("SELECT * FROM agent_customer", 0);
        AbstractC1802o0 $r3 = this.__db;
        C1775g0 $r4 = $r3.getInvalidationTracker();
        String[] $r5 = {"agent_customer"};
        LiveData $r6 = $r4.m34533e($r5, false, new Callable<List<AgentCustomerEntity>>() { // from class: ai.kudi.agent.core.domain.db.room_dao.AgentCustomerDao_Impl.1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ List<AgentCustomerEntity> call() throws Exception {
                List $r1 = call2();
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* JADX WARN: Incorrect condition in loop: B:5:0x0027 */
            @Override // java.util.concurrent.Callable
            /* renamed from: call  reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.util.List<ai.kudi.agent.core.domain.room_entities.AgentCustomerEntity> call2() throws java.lang.Exception {
                /*
                    r15 = this;
                    ai.kudi.agent.core.domain.db.room_dao.AgentCustomerDao_Impl r0 = ai.kudi.agent.core.domain.p004db.room_dao.AgentCustomerDao_Impl.this
                    androidx.room.o0 r1 = ai.kudi.agent.core.domain.p004db.room_dao.AgentCustomerDao_Impl.access$000(r0)
                    androidx.room.r0 r2 = r2
                    r4 = 0
                    r5 = 0
                    android.database.Cursor r3 = androidx.room.p063z0.C1854c.m34419b(r1, r2, r4, r5)
                    java.lang.String r7 = "name"
                    int r6 = androidx.room.p063z0.C1853b.m34421e(r3, r7)     // Catch: java.lang.Throwable -> L46
                    java.lang.String r7 = "id"
                    int r8 = androidx.room.p063z0.C1853b.m34421e(r3, r7)     // Catch: java.lang.Throwable -> L46
                    java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L46
                    int r10 = r3.getCount()     // Catch: java.lang.Throwable -> L46
                    r9.<init>(r10)     // Catch: java.lang.Throwable -> L46
                L23:
                    boolean r11 = r3.moveToNext()     // Catch: java.lang.Throwable -> L46
                    if (r11 == 0) goto L42
                    boolean r11 = r3.isNull(r6)     // Catch: java.lang.Throwable -> L46
                    if (r11 == 0) goto L31
                    r12 = 0
                    goto L35
                L31:
                    java.lang.String r12 = r3.getString(r6)     // Catch: java.lang.Throwable -> L46
                L35:
                    int r10 = r3.getInt(r8)     // Catch: java.lang.Throwable -> L46
                    ai.kudi.agent.core.domain.room_entities.AgentCustomerEntity r13 = new ai.kudi.agent.core.domain.room_entities.AgentCustomerEntity     // Catch: java.lang.Throwable -> L46
                    r13.<init>(r10, r12)     // Catch: java.lang.Throwable -> L46
                    r9.add(r13)     // Catch: java.lang.Throwable -> L46
                    goto L23
                L42:
                    r3.close()
                    return r9
                L46:
                    r14 = move-exception
                    r3.close()
                    goto L4b
                L4b:
                    throw r14
                */
                throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.core.domain.p004db.room_dao.AgentCustomerDao_Impl.CallableC00511.call2():java.util.List");
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            protected void finalize() {
                C1816r0 $r1 = $r2;
                $r1.m34467J();
            }
        });
        return $r6;
    }
}
