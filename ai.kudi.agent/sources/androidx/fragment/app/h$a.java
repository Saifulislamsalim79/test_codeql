package androidx.fragment.app;
/* compiled from: DialogFragment.java */
/* loaded from: classes2.dex */
class h$a implements Runnable {

    /* renamed from: c */
    final /* synthetic */ h f4570c;

    h$a(h hVar) {
        this.f4570c = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        h.access$100(this.f4570c).onDismiss(h.access$000(this.f4570c));
    }
}
