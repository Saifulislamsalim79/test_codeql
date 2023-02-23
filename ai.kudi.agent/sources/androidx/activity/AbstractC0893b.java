package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: OnBackPressedCallback.java */
/* renamed from: androidx.activity.b */
/* loaded from: classes2.dex */
public abstract class AbstractC0893b {
    private CopyOnWriteArrayList<InterfaceC0892a> mCancellables = new CopyOnWriteArrayList<>();
    private boolean mEnabled;

    public AbstractC0893b(boolean z) {
        this.mEnabled = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addCancellable(InterfaceC0892a interfaceC0892a) {
        this.mCancellables.add(interfaceC0892a);
    }

    public abstract void handleOnBackPressed();

    public final boolean isEnabled() {
        return this.mEnabled;
    }

    public final void remove() {
        Iterator<InterfaceC0892a> it = this.mCancellables.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeCancellable(InterfaceC0892a interfaceC0892a) {
        this.mCancellables.remove(interfaceC0892a);
    }

    public final void setEnabled(boolean z) {
        this.mEnabled = z;
    }
}
