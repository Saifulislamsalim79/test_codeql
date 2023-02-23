package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import androidx.lifecycle.InterfaceC1584v;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DialogFragment.java */
/* loaded from: classes2.dex */
public class h$d implements InterfaceC1584v<androidx.lifecycle.o> {

    /* renamed from: a */
    final /* synthetic */ h f4573a;

    h$d(h hVar) {
        this.f4573a = hVar;
    }

    @Override // androidx.lifecycle.InterfaceC1584v
    /* renamed from: b */
    public void mo35481a(androidx.lifecycle.o oVar) {
        if (oVar == null || !h.access$200(this.f4573a)) {
            return;
        }
        View requireView = this.f4573a.requireView();
        if (requireView.getParent() == null) {
            if (h.access$000(this.f4573a) != null) {
                if (FragmentManager.m35996G0(3)) {
                    Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + h.access$000(this.f4573a));
                }
                h.access$000(this.f4573a).setContentView(requireView);
                return;
            }
            return;
        }
        throw new IllegalStateException("DialogFragment can not be attached to a container view");
    }
}
