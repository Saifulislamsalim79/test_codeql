package p272h.p286c.p287a.p323c.p332q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.C1097f;
import androidx.core.widget.C1392c;
import com.google.android.material.internal.C4695q;
import com.google.android.material.theme.p106a.C4804a;
import p272h.p286c.p287a.p323c.C9233b;
import p272h.p286c.p287a.p323c.C9276k;
import p272h.p286c.p287a.p323c.C9277l;
import p272h.p286c.p287a.p323c.p335s.C9310a;
import p272h.p286c.p287a.p323c.p342z.C9321c;
/* compiled from: MaterialCheckBox.java */
/* renamed from: h.c.a.c.q.a */
/* loaded from: classes2.dex */
public class C9298a extends C1097f {

    /* renamed from: x */
    private static final int f21871x = C9276k.Widget_MaterialComponents_CompoundButton_CheckBox;

    /* renamed from: y */
    private static final int[][] f21872y = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: f */
    private ColorStateList f21873f;

    /* renamed from: w */
    private boolean f21874w;

    public C9298a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9233b.checkboxStyle);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f21873f == null) {
            int[] iArr = new int[f21872y.length];
            int m15082c = C9310a.m15082c(this, C9233b.colorControlActivated);
            int m15082c2 = C9310a.m15082c(this, C9233b.colorSurface);
            int m15082c3 = C9310a.m15082c(this, C9233b.colorOnSurface);
            iArr[0] = C9310a.m15079f(m15082c2, m15082c, 1.0f);
            iArr[1] = C9310a.m15079f(m15082c2, m15082c3, 0.54f);
            iArr[2] = C9310a.m15079f(m15082c2, m15082c3, 0.38f);
            iArr[3] = C9310a.m15079f(m15082c2, m15082c3, 0.38f);
            this.f21873f = new ColorStateList(f21872y, iArr);
        }
        return this.f21873f;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f21874w && C1392c.m36121b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f21874w = z;
        if (z) {
            C1392c.m36120c(this, getMaterialThemeColorsTintList());
        } else {
            C1392c.m36120c(this, null);
        }
    }

    public C9298a(Context context, AttributeSet attributeSet, int i) {
        super(C4804a.m26258c(context, attributeSet, i, f21871x), attributeSet, i);
        Context context2 = getContext();
        TypedArray m26690h = C4695q.m26690h(context2, attributeSet, C9277l.MaterialCheckBox, i, f21871x, new int[0]);
        if (m26690h.hasValue(C9277l.MaterialCheckBox_buttonTint)) {
            C1392c.m36120c(this, C9321c.m15053a(context2, m26690h, C9277l.MaterialCheckBox_buttonTint));
        }
        this.f21874w = m26690h.getBoolean(C9277l.MaterialCheckBox_useMaterialThemeColors, false);
        m26690h.recycle();
    }
}
