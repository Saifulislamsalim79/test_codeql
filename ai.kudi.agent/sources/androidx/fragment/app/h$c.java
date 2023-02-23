package androidx.fragment.app;

import android.content.DialogInterface;
/* compiled from: DialogFragment.java */
/* loaded from: classes2.dex */
class h$c implements DialogInterface.OnDismissListener {

    /* renamed from: c */
    final /* synthetic */ h f4572c;

    h$c(h hVar) {
        this.f4572c = hVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (h.access$000(this.f4572c) != null) {
            h hVar = this.f4572c;
            hVar.onDismiss(h.access$000(hVar));
        }
    }
}
