package p272h.p286c.p287a.p323c.p328m;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;
/* compiled from: ImageMatrixProperty.java */
/* renamed from: h.c.a.c.m.f */
/* loaded from: classes2.dex */
public class C9283f extends Property<ImageView, Matrix> {

    /* renamed from: a */
    private final Matrix f21815a;

    public C9283f() {
        super(Matrix.class, "imageMatrixProperty");
        this.f21815a = new Matrix();
    }

    @Override // android.util.Property
    /* renamed from: a */
    public Matrix get(ImageView imageView) {
        this.f21815a.set(imageView.getImageMatrix());
        return this.f21815a;
    }

    @Override // android.util.Property
    /* renamed from: b */
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
