package p272h.p286c.p287a.p323c.p328m;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
/* compiled from: MatrixEvaluator.java */
/* renamed from: h.c.a.c.m.g */
/* loaded from: classes2.dex */
public class C9284g implements TypeEvaluator<Matrix> {

    /* renamed from: a */
    private final float[] f21816a = new float[9];

    /* renamed from: b */
    private final float[] f21817b = new float[9];

    /* renamed from: c */
    private final Matrix f21818c = new Matrix();

    /* renamed from: a */
    public Matrix mo15226a(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f21816a);
        matrix2.getValues(this.f21817b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f21817b;
            float f2 = fArr[i];
            float[] fArr2 = this.f21816a;
            fArr[i] = fArr2[i] + ((f2 - fArr2[i]) * f);
        }
        this.f21818c.setValues(this.f21817b);
        return this.f21818c;
    }
}
