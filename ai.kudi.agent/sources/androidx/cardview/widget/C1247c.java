package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.cardview.widget.C1252g;
/* compiled from: CardViewBaseImpl.java */
/* renamed from: androidx.cardview.widget.c */
/* loaded from: classes2.dex */
class C1247c implements InterfaceC1250e {

    /* renamed from: a */
    final RectF f3724a = new RectF();

    /* compiled from: CardViewBaseImpl.java */
    /* renamed from: androidx.cardview.widget.c$a */
    /* loaded from: classes2.dex */
    class C1248a implements C1252g.InterfaceC1253a {
        C1248a() {
        }

        @Override // androidx.cardview.widget.C1252g.InterfaceC1253a
        /* renamed from: a */
        public void mo36639a(Canvas canvas, RectF rectF, float f, Paint paint) {
            float f2 = 2.0f * f;
            float width = (rectF.width() - f2) - 1.0f;
            float height = (rectF.height() - f2) - 1.0f;
            if (f >= 1.0f) {
                float f3 = f + 0.5f;
                float f4 = -f3;
                C1247c.this.f3724a.set(f4, f4, f3, f3);
                int save = canvas.save();
                canvas.translate(rectF.left + f3, rectF.top + f3);
                canvas.drawArc(C1247c.this.f3724a, 180.0f, 90.0f, true, paint);
                canvas.translate(width, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(C1247c.this.f3724a, 180.0f, 90.0f, true, paint);
                canvas.translate(height, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(C1247c.this.f3724a, 180.0f, 90.0f, true, paint);
                canvas.translate(width, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(C1247c.this.f3724a, 180.0f, 90.0f, true, paint);
                canvas.restoreToCount(save);
                float f5 = rectF.top;
                canvas.drawRect((rectF.left + f3) - 1.0f, f5, (rectF.right - f3) + 1.0f, f5 + f3, paint);
                float f6 = rectF.bottom;
                canvas.drawRect((rectF.left + f3) - 1.0f, f6 - f3, (rectF.right - f3) + 1.0f, f6, paint);
            }
            canvas.drawRect(rectF.left, rectF.top + f, rectF.right, rectF.bottom - f, paint);
        }
    }

    /* renamed from: o */
    private C1252g m36692o(Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        return new C1252g(context.getResources(), colorStateList, f, f2, f3);
    }

    /* renamed from: p */
    private C1252g m36691p(InterfaceC1249d interfaceC1249d) {
        return (C1252g) interfaceC1249d.mo36684g();
    }

    @Override // androidx.cardview.widget.InterfaceC1250e
    /* renamed from: a */
    public void mo36682a(InterfaceC1249d interfaceC1249d, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C1252g m36692o = m36692o(context, colorStateList, f, f2, f3);
        m36692o.m36647m(interfaceC1249d.mo36686e());
        interfaceC1249d.mo36687d(m36692o);
        m36690q(interfaceC1249d);
    }

    @Override // androidx.cardview.widget.InterfaceC1250e
    /* renamed from: b */
    public void mo36681b(InterfaceC1249d interfaceC1249d, float f) {
        m36691p(interfaceC1249d).m36644p(f);
        m36690q(interfaceC1249d);
    }

    @Override // androidx.cardview.widget.InterfaceC1250e
    /* renamed from: c */
    public float mo36680c(InterfaceC1249d interfaceC1249d) {
        return m36691p(interfaceC1249d).m36648l();
    }

    @Override // androidx.cardview.widget.InterfaceC1250e
    /* renamed from: d */
    public float mo36679d(InterfaceC1249d interfaceC1249d) {
        return m36691p(interfaceC1249d).m36653g();
    }

    @Override // androidx.cardview.widget.InterfaceC1250e
    /* renamed from: e */
    public void mo36678e(InterfaceC1249d interfaceC1249d) {
    }

    @Override // androidx.cardview.widget.InterfaceC1250e
    /* renamed from: f */
    public void mo36677f(InterfaceC1249d interfaceC1249d, float f) {
        m36691p(interfaceC1249d).m36642r(f);
    }

    @Override // androidx.cardview.widget.InterfaceC1250e
    /* renamed from: g */
    public float mo36676g(InterfaceC1249d interfaceC1249d) {
        return m36691p(interfaceC1249d).m36651i();
    }

    @Override // androidx.cardview.widget.InterfaceC1250e
    /* renamed from: h */
    public ColorStateList mo36675h(InterfaceC1249d interfaceC1249d) {
        return m36691p(interfaceC1249d).m36654f();
    }

    @Override // androidx.cardview.widget.InterfaceC1250e
    /* renamed from: i */
    public void mo36674i() {
        C1252g.f3738r = new C1248a();
    }

    @Override // androidx.cardview.widget.InterfaceC1250e
    /* renamed from: j */
    public float mo36673j(InterfaceC1249d interfaceC1249d) {
        return m36691p(interfaceC1249d).m36650j();
    }

    @Override // androidx.cardview.widget.InterfaceC1250e
    /* renamed from: k */
    public float mo36672k(InterfaceC1249d interfaceC1249d) {
        return m36691p(interfaceC1249d).m36649k();
    }

    @Override // androidx.cardview.widget.InterfaceC1250e
    /* renamed from: l */
    public void mo36671l(InterfaceC1249d interfaceC1249d) {
        m36691p(interfaceC1249d).m36647m(interfaceC1249d.mo36686e());
        m36690q(interfaceC1249d);
    }

    @Override // androidx.cardview.widget.InterfaceC1250e
    /* renamed from: m */
    public void mo36670m(InterfaceC1249d interfaceC1249d, ColorStateList colorStateList) {
        m36691p(interfaceC1249d).m36645o(colorStateList);
    }

    @Override // androidx.cardview.widget.InterfaceC1250e
    /* renamed from: n */
    public void mo36669n(InterfaceC1249d interfaceC1249d, float f) {
        m36691p(interfaceC1249d).m36643q(f);
        m36690q(interfaceC1249d);
    }

    /* renamed from: q */
    public void m36690q(InterfaceC1249d interfaceC1249d) {
        Rect rect = new Rect();
        m36691p(interfaceC1249d).m36652h(rect);
        interfaceC1249d.mo36688c((int) Math.ceil(mo36672k(interfaceC1249d)), (int) Math.ceil(mo36673j(interfaceC1249d)));
        interfaceC1249d.mo36689b(rect.left, rect.top, rect.right, rect.bottom);
    }
}
