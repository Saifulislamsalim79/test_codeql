package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.p057e.C1355f;
import p201g.p202a.p203k.p204a.C7462a;
/* compiled from: TintTypedArray.java */
/* renamed from: androidx.appcompat.widget.r0 */
/* loaded from: classes2.dex */
public class C1138r0 {

    /* renamed from: a */
    private final Context f3459a;

    /* renamed from: b */
    private final TypedArray f3460b;

    /* renamed from: c */
    private TypedValue f3461c;

    private C1138r0(Context context, TypedArray typedArray) {
        this.f3459a = context;
        this.f3460b = typedArray;
    }

    /* renamed from: t */
    public static C1138r0 m37028t(Context context, int i, int[] iArr) {
        return new C1138r0(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: u */
    public static C1138r0 m37027u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C1138r0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: v */
    public static C1138r0 m37026v(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C1138r0(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: a */
    public boolean m37047a(int i, boolean z) {
        return this.f3460b.getBoolean(i, z);
    }

    /* renamed from: b */
    public int m37046b(int i, int i2) {
        return this.f3460b.getColor(i, i2);
    }

    /* renamed from: c */
    public ColorStateList m37045c(int i) {
        int resourceId;
        ColorStateList m18691c;
        return (!this.f3460b.hasValue(i) || (resourceId = this.f3460b.getResourceId(i, 0)) == 0 || (m18691c = C7462a.m18691c(this.f3459a, resourceId)) == null) ? this.f3460b.getColorStateList(i) : m18691c;
    }

    /* renamed from: d */
    public float m37044d(int i, float f) {
        return this.f3460b.getDimension(i, f);
    }

    /* renamed from: e */
    public int m37043e(int i, int i2) {
        return this.f3460b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: f */
    public int m37042f(int i, int i2) {
        return this.f3460b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: g */
    public Drawable m37041g(int i) {
        int resourceId;
        if (this.f3460b.hasValue(i) && (resourceId = this.f3460b.getResourceId(i, 0)) != 0) {
            return C7462a.m18690d(this.f3459a, resourceId);
        }
        return this.f3460b.getDrawable(i);
    }

    /* renamed from: h */
    public Drawable m37040h(int i) {
        int resourceId;
        if (!this.f3460b.hasValue(i) || (resourceId = this.f3460b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return C1111i.m37134b().m37132d(this.f3459a, resourceId, true);
    }

    /* renamed from: i */
    public float m37039i(int i, float f) {
        return this.f3460b.getFloat(i, f);
    }

    /* renamed from: j */
    public Typeface m37038j(int i, int i2, C1355f.AbstractC1358c abstractC1358c) {
        int resourceId = this.f3460b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f3461c == null) {
            this.f3461c = new TypedValue();
        }
        return C1355f.m36244f(this.f3459a, resourceId, this.f3461c, i2, abstractC1358c);
    }

    /* renamed from: k */
    public int m37037k(int i, int i2) {
        return this.f3460b.getInt(i, i2);
    }

    /* renamed from: l */
    public int m37036l(int i, int i2) {
        return this.f3460b.getInteger(i, i2);
    }

    /* renamed from: m */
    public int m37035m(int i, int i2) {
        return this.f3460b.getLayoutDimension(i, i2);
    }

    /* renamed from: n */
    public int m37034n(int i, int i2) {
        return this.f3460b.getResourceId(i, i2);
    }

    /* renamed from: o */
    public String m37033o(int i) {
        return this.f3460b.getString(i);
    }

    /* renamed from: p */
    public CharSequence m37032p(int i) {
        return this.f3460b.getText(i);
    }

    /* renamed from: q */
    public CharSequence[] m37031q(int i) {
        return this.f3460b.getTextArray(i);
    }

    /* renamed from: r */
    public TypedArray m37030r() {
        return this.f3460b;
    }

    /* renamed from: s */
    public boolean m37029s(int i) {
        return this.f3460b.hasValue(i);
    }

    /* renamed from: w */
    public void m37025w() {
        this.f3460b.recycle();
    }
}
