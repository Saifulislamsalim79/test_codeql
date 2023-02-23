package p201g.p266v;

import android.graphics.Matrix;
import android.view.View;
/* compiled from: ViewUtilsApi21.java */
/* renamed from: g.v.e0 */
/* loaded from: classes2.dex */
class C8142e0 extends C8136d0 {

    /* renamed from: f */
    private static boolean f19530f = true;

    /* renamed from: g */
    private static boolean f19531g = true;

    @Override // p201g.p266v.C8150i0
    /* renamed from: h */
    public void mo16670h(View view, Matrix matrix) {
        if (f19530f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f19530f = false;
            }
        }
    }

    @Override // p201g.p266v.C8150i0
    /* renamed from: i */
    public void mo16669i(View view, Matrix matrix) {
        if (f19531g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f19531g = false;
            }
        }
    }
}
