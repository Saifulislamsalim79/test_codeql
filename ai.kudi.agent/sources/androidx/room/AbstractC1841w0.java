package androidx.room;

import java.util.concurrent.atomic.AtomicBoolean;
import p201g.p262t.p263a.InterfaceC8101k;
/* compiled from: SharedSQLiteStatement.java */
/* renamed from: androidx.room.w0 */
/* loaded from: classes2.dex */
public abstract class AbstractC1841w0 {
    private final AbstractC1802o0 mDatabase;
    private final AtomicBoolean mLock = new AtomicBoolean(false);
    private volatile InterfaceC8101k mStmt;

    public AbstractC1841w0(AbstractC1802o0 abstractC1802o0) {
        this.mDatabase = abstractC1802o0;
    }

    private InterfaceC8101k createNewStatement() {
        return this.mDatabase.compileStatement(createQuery());
    }

    private InterfaceC8101k getStmt(boolean z) {
        if (z) {
            if (this.mStmt == null) {
                this.mStmt = createNewStatement();
            }
            return this.mStmt;
        }
        return createNewStatement();
    }

    public InterfaceC8101k acquire() {
        assertNotMainThread();
        return getStmt(this.mLock.compareAndSet(false, true));
    }

    protected void assertNotMainThread() {
        this.mDatabase.assertNotMainThread();
    }

    protected abstract String createQuery();

    public void release(InterfaceC8101k interfaceC8101k) {
        if (interfaceC8101k == this.mStmt) {
            this.mLock.set(false);
        }
    }
}
