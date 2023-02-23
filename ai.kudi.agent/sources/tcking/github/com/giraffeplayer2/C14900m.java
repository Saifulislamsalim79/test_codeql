package tcking.github.com.giraffeplayer2;

import android.content.Context;
import android.view.TextureView;
/* compiled from: ScalableTextureView.java */
/* renamed from: tcking.github.com.giraffeplayer2.m */
/* loaded from: classes3.dex */
public class C14900m extends TextureView implements InterfaceC14899l {

    /* renamed from: c */
    private C14890f f33348c;

    public C14900m(Context context) {
        super(context);
        m56b();
    }

    /* renamed from: b */
    private void m56b() {
        this.f33348c = new C14890f(this);
    }

    @Override // tcking.github.com.giraffeplayer2.InterfaceC14899l
    /* renamed from: a */
    public void mo57a(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        this.f33348c.m104e(i, i2);
        requestLayout();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        this.f33348c.m108a(i, i2);
        setMeasuredDimension(this.f33348c.m106c(), this.f33348c.m107b());
    }

    public void setAspectRatio(int i) {
        this.f33348c.m105d(i);
        requestLayout();
    }
}
