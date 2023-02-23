package androidx.room;

import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Callable;
/* compiled from: InvalidationLiveDataContainer.java */
/* renamed from: androidx.room.f0 */
/* loaded from: classes2.dex */
class C1773f0 {

    /* renamed from: a */
    final Set<LiveData> f5406a = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: b */
    private final AbstractC1802o0 f5407b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1773f0(AbstractC1802o0 abstractC1802o0) {
        this.f5407b = abstractC1802o0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public <T> LiveData<T> m34540a(String[] strArr, boolean z, Callable<T> callable) {
        return new C1818s0(this.f5407b, this, z, callable, strArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m34539b(LiveData liveData) {
        this.f5406a.add(liveData);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m34538c(LiveData liveData) {
        this.f5406a.remove(liveData);
    }
}
