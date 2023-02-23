package ai.kudi.dip.library.button;

import ai.kudi.dip.library.C0755a;
import ai.kudi.dip.library.C0756b;
import ai.kudi.dip.library.C0771c;
import ai.kudi.dip.library.C0799g;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C1335a;
import androidx.core.content.p057e.C1355f;
import androidx.core.graphics.drawable.C1365a;
import io.intercom.android.sdk.views.holder.AttributeType;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.e0.d.l;
import p201g.p267w.p268a.p269a.C8199i;
/* compiled from: KudiBadgeButton.kt */
@Metadata(m10422d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0002J\u000e\u0010\u0018\u001a\n \u001a*\u0004\u0018\u00010\u00190\u0019J\u0006\u0010\u001b\u001a\u00020\fJ\u0018\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\nH\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\nJ\u000e\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, m10421d2 = {"Lai/kudi/dip/library/button/KudiBadgeButton;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "array", "Landroid/content/res/TypedArray;", "color", "", "description", "", "drawable", "iconColor", "imageView", "Landroid/widget/ImageView;", "isIconOnly", "", "isTextOnly", "textColor", "tv", "Landroid/widget/TextView;", "getColor", "getIcon", "Landroid/graphics/drawable/Drawable;", "kotlin.jvm.PlatformType", "getText", "initColor", "index", "defValue", "initShapeDrawable", "Landroid/graphics/drawable/GradientDrawable;", "setIcon", "", "res", "setText", AttributeType.TEXT, "kudi-dip-library_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class KudiBadgeButton extends LinearLayout {

    /* renamed from: A */
    private final ImageView f2136A;

    /* renamed from: B */
    private final TypedArray f2137B;

    /* renamed from: c */
    private final int f2138c;

    /* renamed from: d */
    private final int f2139d;

    /* renamed from: e */
    private final int f2140e;

    /* renamed from: f */
    private final int f2141f;

    /* renamed from: w */
    private final String f2142w;

    /* renamed from: x */
    private final boolean f2143x;

    /* renamed from: y */
    private final boolean f2144y;

    /* renamed from: z */
    private final TextView f2145z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KudiBadgeButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        l.f(attributeSet, "attributeSet");
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0799g.KudiBadgeButton);
        l.e(obtainStyledAttributes, "getContext().obtainStyledAttributes(attributeSet, R.styleable.KudiBadgeButton)");
        this.f2137B = obtainStyledAttributes;
        this.f2138c = obtainStyledAttributes.getResourceId(C0799g.KudiBadgeButton_badgeIcon, C0756b.ic_error_black_24dp);
        this.f2139d = m38038b(C0799g.KudiBadgeButton_badgeBgColor, m38039a(context, C0755a.kudiBadgeLightBlue));
        this.f2140e = m38038b(C0799g.KudiBadgeButton_badgeTextColor, m38039a(context, C0755a.kudiBadgeDarkBlue));
        this.f2141f = m38038b(C0799g.KudiBadgeButton_badgeDrawableFilter, m38039a(context, C0755a.kudiBadgeDarkBlue));
        this.f2142w = this.f2137B.getString(C0799g.KudiBadgeButton_badgeText);
        this.f2144y = this.f2137B.getBoolean(C0799g.KudiBadgeButton_isIconOnly, false);
        this.f2143x = this.f2137B.getBoolean(C0799g.KudiBadgeButton_isTextOnly, false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setLayoutParams(layoutParams);
        setOrientation(0);
        GradientDrawable m38037c = m38037c(context);
        m38037c.setColor(this.f2139d);
        m38037c.setStroke(0, this.f2139d);
        setBackground(m38037c);
        C8199i m16520b = C8199i.m16520b(getResources(), this.f2138c, null);
        l.d(m16520b);
        m16520b.mutate();
        C1365a.m36188n(m16520b, this.f2141f);
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(m16520b);
        layoutParams.setMargins(4, 4, 4, 4);
        imageView.setPadding(8, 8, 8, 8);
        setGravity(16);
        imageView.setLayoutParams(layoutParams);
        C13666w c13666w = C13666w.f30112a;
        this.f2136A = imageView;
        TextView textView = new TextView(context);
        textView.setTextColor(this.f2140e);
        textView.setTypeface(C1355f.m36245e(context, C0771c.garant_medium));
        layoutParams.setMargins(4, 4, 4, 4);
        textView.setPadding(8, 8, 8, 8);
        textView.setLayoutParams(layoutParams);
        textView.setText(this.f2142w);
        C13666w c13666w2 = C13666w.f30112a;
        this.f2145z = textView;
        addView(this.f2136A);
        addView(this.f2145z);
        if (this.f2144y) {
            this.f2145z.setVisibility(8);
        } else if (this.f2143x) {
            this.f2136A.setVisibility(8);
        }
        this.f2137B.recycle();
    }

    /* renamed from: a */
    private final int m38039a(Context context, int i) {
        return C1335a.m36324d(context, i);
    }

    /* renamed from: b */
    private final int m38038b(int i, int i2) {
        return this.f2137B.getColor(i, i2);
    }

    /* renamed from: c */
    private final GradientDrawable m38037c(Context context) {
        Drawable m36322f = C1335a.m36322f(context, C0756b.shape_rect);
        Drawable mutate = m36322f == null ? null : m36322f.mutate();
        if (mutate != null) {
            return (GradientDrawable) mutate;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
    }

    public final Drawable getIcon() {
        return this.f2136A.getDrawable();
    }

    public final String getText() {
        return this.f2145z.getText().toString();
    }

    public final void setIcon(int i) {
        this.f2136A.setImageResource(i);
    }

    public final void setText(String str) {
        l.f(str, AttributeType.TEXT);
        this.f2145z.setText(str);
    }
}
