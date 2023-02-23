package androidx.fragment.app;

import android.content.DialogInterface;
/* compiled from: DialogFragment.java */
/* loaded from: classes2.dex */
class h$b implements DialogInterface.OnCancelListener {

    /* renamed from: c */
    final /* synthetic */ h f4571c;

    h$b(h hVar) {
        this.f4571c = hVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        if (h.access$000(this.f4571c) != null) {
            h hVar = this.f4571c;
            hVar.onCancel(h.access$000(hVar));
        }
    }
}
