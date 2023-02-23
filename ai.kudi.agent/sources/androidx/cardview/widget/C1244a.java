package androidx.cardview.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.cardview.widget.C1252g;
/* compiled from: CardViewApi17Impl.java */
/* renamed from: androidx.cardview.widget.a */
/* loaded from: classes2.dex */
class C1244a extends C1247c {

    /* compiled from: CardViewApi17Impl.java */
    /* renamed from: androidx.cardview.widget.a$a */
    /* loaded from: classes2.dex */
    class C1245a implements C1252g.InterfaceC1253a {
        C1245a(C1244a c1244a) {
        }

        @Override // androidx.cardview.widget.C1252g.InterfaceC1253a
        /* renamed from: a */
        public void mo36639a(Canvas canvas, RectF rectF, float f, Paint paint) {
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    @Override // androidx.cardview.widget.C1247c, androidx.cardview.widget.InterfaceC1250e
    /* renamed from: i */
    public void mo36674i() {
        C1252g.f3738r = new C1245a(this);
    }
}
