package p201g.p266v;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;
/* compiled from: PathProperty.java */
/* renamed from: g.v.h */
/* loaded from: classes2.dex */
class C8147h<T> extends Property<T, Float> {

    /* renamed from: a */
    private final Property<T, PointF> f19534a;

    /* renamed from: b */
    private final PathMeasure f19535b;

    /* renamed from: c */
    private final float f19536c;

    /* renamed from: d */
    private final float[] f19537d;

    /* renamed from: e */
    private final PointF f19538e;

    /* renamed from: f */
    private float f19539f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8147h(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f19537d = new float[2];
        this.f19538e = new PointF();
        this.f19534a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f19535b = pathMeasure;
        this.f19536c = pathMeasure.getLength();
    }

    @Override // android.util.Property
    /* renamed from: a */
    public Float get(T t) {
        return Float.valueOf(this.f19539f);
    }

    @Override // android.util.Property
    /* renamed from: b */
    public void set(T t, Float f) {
        this.f19539f = f.floatValue();
        this.f19535b.getPosTan(this.f19536c * f.floatValue(), this.f19537d, null);
        PointF pointF = this.f19538e;
        float[] fArr = this.f19537d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f19534a.set(t, pointF);
    }
}
