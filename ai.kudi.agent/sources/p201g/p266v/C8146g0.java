package p201g.p266v;

import android.os.Build;
import android.view.View;
/* compiled from: ViewUtilsApi23.java */
/* renamed from: g.v.g0 */
/* loaded from: classes2.dex */
class C8146g0 extends C8144f0 {

    /* renamed from: i */
    private static boolean f19533i = true;

    @Override // p201g.p266v.C8150i0
    /* renamed from: g */
    public void mo16671g(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo16671g(view, i);
        } else if (f19533i) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f19533i = false;
            }
        }
    }
}
