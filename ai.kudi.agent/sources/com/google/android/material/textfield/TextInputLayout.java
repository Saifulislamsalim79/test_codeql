package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C1068a0;
import androidx.appcompat.widget.C1111i;
import androidx.appcompat.widget.C1138r0;
import androidx.core.content.C1335a;
import androidx.core.graphics.drawable.C1365a;
import androidx.core.widget.C1398i;
import com.google.android.material.internal.C4657a;
import com.google.android.material.internal.C4661c;
import com.google.android.material.internal.C4695q;
import com.google.android.material.internal.C4696r;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.theme.p106a.C4804a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p201g.p202a.p203k.p204a.C7462a;
import p201g.p227h.p235j.C7651a;
import p201g.p227h.p238l.C7676a;
import p201g.p227h.p238l.C7713h;
import p201g.p227h.p238l.C7759x;
import p201g.p227h.p238l.p239h0.C7716c;
import p201g.p243j.p244a.AbstractC7781a;
import p272h.p286c.p287a.p323c.C9233b;
import p272h.p286c.p287a.p323c.C9236c;
import p272h.p286c.p287a.p323c.C9267d;
import p272h.p286c.p287a.p323c.C9271f;
import p272h.p286c.p287a.p323c.C9273h;
import p272h.p286c.p287a.p323c.C9275j;
import p272h.p286c.p287a.p323c.C9276k;
import p272h.p286c.p287a.p323c.C9277l;
import p272h.p286c.p287a.p323c.p326c0.C9243g;
import p272h.p286c.p287a.p323c.p326c0.C9250k;
import p272h.p286c.p287a.p323c.p328m.C9278a;
import p272h.p286c.p287a.p323c.p335s.C9310a;
import p272h.p286c.p287a.p323c.p342z.C9321c;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* loaded from: classes2.dex */
public class TextInputLayout extends LinearLayout {

    /* renamed from: b1 */
    private static final int f11977b1 = C9276k.Widget_Design_TextInputLayout;

    /* renamed from: A */
    private int f11978A;

    /* renamed from: A0 */
    private PorterDuff.Mode f11979A0;

    /* renamed from: B */
    private boolean f11980B;

    /* renamed from: B0 */
    private boolean f11981B0;

    /* renamed from: C */
    private TextView f11982C;

    /* renamed from: C0 */
    private Drawable f11983C0;

    /* renamed from: D */
    private int f11984D;

    /* renamed from: D0 */
    private int f11985D0;

    /* renamed from: E */
    private int f11986E;

    /* renamed from: E0 */
    private Drawable f11987E0;

    /* renamed from: F */
    private CharSequence f11988F;

    /* renamed from: F0 */
    private View.OnLongClickListener f11989F0;

    /* renamed from: G */
    private boolean f11990G;

    /* renamed from: G0 */
    private View.OnLongClickListener f11991G0;

    /* renamed from: H */
    private TextView f11992H;

    /* renamed from: H0 */
    private final CheckableImageButton f11993H0;

    /* renamed from: I */
    private ColorStateList f11994I;

    /* renamed from: I0 */
    private ColorStateList f11995I0;

    /* renamed from: J */
    private int f11996J;

    /* renamed from: J0 */
    private ColorStateList f11997J0;

    /* renamed from: K */
    private ColorStateList f11998K;

    /* renamed from: K0 */
    private ColorStateList f11999K0;

    /* renamed from: L */
    private ColorStateList f12000L;

    /* renamed from: L0 */
    private int f12001L0;

    /* renamed from: M */
    private CharSequence f12002M;

    /* renamed from: M0 */
    private int f12003M0;

    /* renamed from: N */
    private final TextView f12004N;

    /* renamed from: N0 */
    private int f12005N0;

    /* renamed from: O */
    private CharSequence f12006O;

    /* renamed from: O0 */
    private ColorStateList f12007O0;

    /* renamed from: P */
    private final TextView f12008P;

    /* renamed from: P0 */
    private int f12009P0;

    /* renamed from: Q */
    private boolean f12010Q;

    /* renamed from: Q0 */
    private int f12011Q0;

    /* renamed from: R */
    private CharSequence f12012R;

    /* renamed from: R0 */
    private int f12013R0;

    /* renamed from: S */
    private boolean f12014S;

    /* renamed from: S0 */
    private int f12015S0;

    /* renamed from: T */
    private C9243g f12016T;

    /* renamed from: T0 */
    private int f12017T0;

    /* renamed from: U */
    private C9243g f12018U;

    /* renamed from: U0 */
    private boolean f12019U0;

    /* renamed from: V */
    private C9250k f12020V;

    /* renamed from: V0 */
    final C4657a f12021V0;

    /* renamed from: W */
    private final int f12022W;

    /* renamed from: W0 */
    private boolean f12023W0;

    /* renamed from: X0 */
    private boolean f12024X0;

    /* renamed from: Y0 */
    private ValueAnimator f12025Y0;

    /* renamed from: Z0 */
    private boolean f12026Z0;

    /* renamed from: a0 */
    private int f12027a0;

    /* renamed from: a1 */
    private boolean f12028a1;

    /* renamed from: b0 */
    private int f12029b0;

    /* renamed from: c */
    private final FrameLayout f12030c;

    /* renamed from: c0 */
    private int f12031c0;

    /* renamed from: d */
    private final LinearLayout f12032d;

    /* renamed from: d0 */
    private int f12033d0;

    /* renamed from: e */
    private final LinearLayout f12034e;

    /* renamed from: e0 */
    private int f12035e0;

    /* renamed from: f */
    private final FrameLayout f12036f;

    /* renamed from: f0 */
    private int f12037f0;

    /* renamed from: g0 */
    private int f12038g0;

    /* renamed from: h0 */
    private final Rect f12039h0;

    /* renamed from: i0 */
    private final Rect f12040i0;

    /* renamed from: j0 */
    private final RectF f12041j0;

    /* renamed from: k0 */
    private Typeface f12042k0;

    /* renamed from: l0 */
    private final CheckableImageButton f12043l0;

    /* renamed from: m0 */
    private ColorStateList f12044m0;

    /* renamed from: n0 */
    private boolean f12045n0;

    /* renamed from: o0 */
    private PorterDuff.Mode f12046o0;

    /* renamed from: p0 */
    private boolean f12047p0;

    /* renamed from: q0 */
    private Drawable f12048q0;

    /* renamed from: r0 */
    private int f12049r0;

    /* renamed from: s0 */
    private View.OnLongClickListener f12050s0;

    /* renamed from: t0 */
    private final LinkedHashSet<InterfaceC4762f> f12051t0;

    /* renamed from: u0 */
    private int f12052u0;

    /* renamed from: v0 */
    private final SparseArray<AbstractC4792e> f12053v0;

    /* renamed from: w */
    EditText f12054w;

    /* renamed from: w0 */
    private final CheckableImageButton f12055w0;

    /* renamed from: x */
    private CharSequence f12056x;

    /* renamed from: x0 */
    private final LinkedHashSet<InterfaceC4763g> f12057x0;

    /* renamed from: y */
    private final C4793f f12058y;

    /* renamed from: y0 */
    private ColorStateList f12059y0;

    /* renamed from: z */
    boolean f12060z;

    /* renamed from: z0 */
    private boolean f12061z0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.TextInputLayout$a */
    /* loaded from: classes2.dex */
    public class C4757a implements TextWatcher {
        C4757a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.m26388u0(!textInputLayout.f12028a1);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f12060z) {
                textInputLayout2.m26402n0(editable.length());
            }
            if (TextInputLayout.this.f11990G) {
                TextInputLayout.this.m26380y0(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$b */
    /* loaded from: classes2.dex */
    class RunnableC4758b implements Runnable {
        RunnableC4758b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f12055w0.performClick();
            TextInputLayout.this.f12055w0.jumpDrawablesToCurrentState();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$c */
    /* loaded from: classes2.dex */
    class RunnableC4759c implements Runnable {
        RunnableC4759c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f12054w.requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.TextInputLayout$d */
    /* loaded from: classes2.dex */
    public class C4760d implements ValueAnimator.AnimatorUpdateListener {
        C4760d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f12021V0.m26818d0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$e */
    /* loaded from: classes2.dex */
    public static class C4761e extends C7676a {

        /* renamed from: d */
        private final TextInputLayout f12066d;

        public C4761e(TextInputLayout textInputLayout) {
            this.f12066d = textInputLayout;
        }

        @Override // p201g.p227h.p238l.C7676a
        /* renamed from: g */
        public void mo17396g(View view, C7716c c7716c) {
            super.mo17396g(view, c7716c);
            EditText editText = this.f12066d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f12066d.getHint();
            CharSequence error = this.f12066d.getError();
            CharSequence placeholderText = this.f12066d.getPlaceholderText();
            int counterMaxLength = this.f12066d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f12066d.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !this.f12066d.m26442N();
            boolean z4 = !TextUtils.isEmpty(error);
            boolean z5 = z4 || !TextUtils.isEmpty(counterOverflowDescription);
            String charSequence = z2 ? hint.toString() : "";
            if (z) {
                c7716c.m17724A0(text);
            } else if (!TextUtils.isEmpty(charSequence)) {
                c7716c.m17724A0(charSequence);
                if (z3 && placeholderText != null) {
                    c7716c.m17724A0(charSequence + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                c7716c.m17724A0(placeholderText);
            }
            if (!TextUtils.isEmpty(charSequence)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    c7716c.m17671l0(charSequence);
                } else {
                    if (z) {
                        charSequence = ((Object) text) + ", " + charSequence;
                    }
                    c7716c.m17724A0(charSequence);
                }
                c7716c.m17649w0(!z);
            }
            c7716c.m17667n0((text == null || text.length() != counterMaxLength) ? -1 : -1);
            if (z5) {
                if (!z4) {
                    error = counterOverflowDescription;
                }
                c7716c.m17679h0(error);
            }
            if (Build.VERSION.SDK_INT < 17 || editText == null) {
                return;
            }
            editText.setLabelFor(C9271f.textinput_helper_text);
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$f */
    /* loaded from: classes2.dex */
    public interface InterfaceC4762f {
        /* renamed from: a */
        void mo26272a(TextInputLayout textInputLayout);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$g */
    /* loaded from: classes2.dex */
    public interface InterfaceC4763g {
        /* renamed from: a */
        void mo26271a(TextInputLayout textInputLayout, int i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.TextInputLayout$h */
    /* loaded from: classes2.dex */
    public static class C4764h extends AbstractC7781a {
        public static final Parcelable.Creator<C4764h> CREATOR = new C4765a();

        /* renamed from: e */
        CharSequence f12067e;

        /* renamed from: f */
        boolean f12068f;

        /* renamed from: w */
        CharSequence f12069w;

        /* renamed from: x */
        CharSequence f12070x;

        /* renamed from: y */
        CharSequence f12071y;

        /* renamed from: com.google.android.material.textfield.TextInputLayout$h$a */
        /* loaded from: classes2.dex */
        static class C4765a implements Parcelable.ClassLoaderCreator<C4764h> {
            C4765a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C4764h createFromParcel(Parcel parcel) {
                return new C4764h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public C4764h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C4764h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public C4764h[] newArray(int i) {
                return new C4764h[i];
            }
        }

        C4764h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f12067e) + " hint=" + ((Object) this.f12069w) + " helperText=" + ((Object) this.f12070x) + " placeholderText=" + ((Object) this.f12071y) + "}";
        }

        @Override // p201g.p243j.p244a.AbstractC7781a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f12067e, parcel, i);
            parcel.writeInt(this.f12068f ? 1 : 0);
            TextUtils.writeToParcel(this.f12069w, parcel, i);
            TextUtils.writeToParcel(this.f12070x, parcel, i);
            TextUtils.writeToParcel(this.f12071y, parcel, i);
        }

        C4764h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f12067e = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f12068f = parcel.readInt() == 1;
            this.f12069w = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f12070x = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f12071y = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9233b.textInputStyle);
    }

    /* renamed from: A */
    private boolean m26460A() {
        return this.f12010Q && !TextUtils.isEmpty(this.f12012R) && (this.f12016T instanceof C4778c);
    }

    /* renamed from: A0 */
    private void m26459A0() {
        this.f12004N.setVisibility((this.f12002M == null || m26442N()) ? 8 : 0);
        m26396q0();
    }

    /* renamed from: B */
    private void m26458B() {
        Iterator<InterfaceC4762f> it = this.f12051t0.iterator();
        while (it.hasNext()) {
            it.next().mo26272a(this);
        }
    }

    /* renamed from: B0 */
    private void m26457B0(boolean z, boolean z2) {
        int defaultColor = this.f12007O0.getDefaultColor();
        int colorForState = this.f12007O0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f12007O0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.f12037f0 = colorForState2;
        } else if (z2) {
            this.f12037f0 = colorForState;
        } else {
            this.f12037f0 = defaultColor;
        }
    }

    /* renamed from: C */
    private void m26456C(int i) {
        Iterator<InterfaceC4763g> it = this.f12057x0.iterator();
        while (it.hasNext()) {
            it.next().mo26271a(this, i);
        }
    }

    /* renamed from: C0 */
    private void m26455C0() {
        if (this.f12054w == null) {
            return;
        }
        C7759x.m17560D0(this.f12008P, getContext().getResources().getDimensionPixelSize(C9267d.material_input_text_to_prefix_suffix_padding), this.f12054w.getPaddingTop(), (m26445K() || m26444L()) ? 0 : C7759x.m17553H(this.f12054w), this.f12054w.getPaddingBottom());
    }

    /* renamed from: D */
    private void m26454D(Canvas canvas) {
        C9243g c9243g = this.f12018U;
        if (c9243g != null) {
            Rect bounds = c9243g.getBounds();
            bounds.top = bounds.bottom - this.f12031c0;
            this.f12018U.draw(canvas);
        }
    }

    /* renamed from: D0 */
    private void m26453D0() {
        int visibility = this.f12008P.getVisibility();
        boolean z = (this.f12006O == null || m26442N()) ? false : true;
        this.f12008P.setVisibility(z ? 0 : 8);
        if (visibility != this.f12008P.getVisibility()) {
            getEndIconDelegate().mo26325c(z);
        }
        m26396q0();
    }

    /* renamed from: E */
    private void m26452E(Canvas canvas) {
        if (this.f12010Q) {
            this.f12021V0.m26807j(canvas);
        }
    }

    /* renamed from: F */
    private void m26450F(boolean z) {
        ValueAnimator valueAnimator = this.f12025Y0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f12025Y0.cancel();
        }
        if (z && this.f12024X0) {
            m26413i(0.0f);
        } else {
            this.f12021V0.m26818d0(0.0f);
        }
        if (m26460A() && ((C4778c) this.f12016T).m26365k0()) {
            m26381y();
        }
        this.f12019U0 = true;
        m26446J();
        m26459A0();
        m26453D0();
    }

    /* renamed from: G */
    private int m26449G(int i, boolean z) {
        int compoundPaddingLeft = i + this.f12054w.getCompoundPaddingLeft();
        return (this.f12002M == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - this.f12004N.getMeasuredWidth()) + this.f12004N.getPaddingLeft();
    }

    /* renamed from: H */
    private int m26448H(int i, boolean z) {
        int compoundPaddingRight = i - this.f12054w.getCompoundPaddingRight();
        return (this.f12002M == null || !z) ? compoundPaddingRight : compoundPaddingRight + (this.f12004N.getMeasuredWidth() - this.f12004N.getPaddingRight());
    }

    /* renamed from: I */
    private boolean m26447I() {
        return this.f12052u0 != 0;
    }

    /* renamed from: J */
    private void m26446J() {
        TextView textView = this.f11992H;
        if (textView == null || !this.f11990G) {
            return;
        }
        textView.setText((CharSequence) null);
        this.f11992H.setVisibility(4);
    }

    /* renamed from: L */
    private boolean m26444L() {
        return this.f11993H0.getVisibility() == 0;
    }

    /* renamed from: P */
    private boolean m26440P() {
        return this.f12027a0 == 1 && (Build.VERSION.SDK_INT < 16 || this.f12054w.getMinLines() <= 1);
    }

    /* renamed from: R */
    private int[] m26438R(CheckableImageButton checkableImageButton) {
        int[] drawableState = getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        return copyOf;
    }

    /* renamed from: S */
    private void m26437S() {
        m26399p();
        m26428a0();
        m26451E0();
        m26408k0();
        m26415h();
        if (this.f12027a0 != 0) {
            m26390t0();
        }
    }

    /* renamed from: T */
    private void m26436T() {
        if (m26460A()) {
            RectF rectF = this.f12041j0;
            this.f12021V0.m26801m(rectF, this.f12054w.getWidth(), this.f12054w.getGravity());
            m26407l(rectF);
            rectF.offset(-getPaddingLeft(), -getPaddingTop());
            ((C4778c) this.f12016T).m26359q0(rectF);
        }
    }

    /* renamed from: U */
    private static void m26435U(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m26435U((ViewGroup) childAt, z);
            }
        }
    }

    /* renamed from: X */
    private void m26432X(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(m26438R(checkableImageButton), colorStateList.getDefaultColor());
        Drawable mutate = C1365a.m36184r(drawable).mutate();
        C1365a.m36187o(mutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    /* renamed from: Z */
    private void m26430Z() {
        TextView textView = this.f11992H;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: a0 */
    private void m26428a0() {
        if (m26414h0()) {
            C7759x.m17492s0(this.f12054w, this.f12016T);
        }
    }

    /* renamed from: b0 */
    private static void m26426b0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean m17540P = C7759x.m17540P(checkableImageButton);
        boolean z = false;
        boolean z2 = onLongClickListener != null;
        z = (m17540P || z2) ? true : true;
        checkableImageButton.setFocusable(z);
        checkableImageButton.setClickable(m17540P);
        checkableImageButton.setPressable(m17540P);
        checkableImageButton.setLongClickable(z2);
        C7759x.m17478z0(checkableImageButton, z ? 1 : 2);
    }

    /* renamed from: c0 */
    private static void m26424c0(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        m26426b0(checkableImageButton, onLongClickListener);
    }

    /* renamed from: d0 */
    private static void m26422d0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m26426b0(checkableImageButton, onLongClickListener);
    }

    /* renamed from: f0 */
    private boolean m26418f0() {
        return (this.f11993H0.getVisibility() == 0 || ((m26447I() && m26445K()) || this.f12006O != null)) && this.f12034e.getMeasuredWidth() > 0;
    }

    /* renamed from: g */
    private void m26417g() {
        TextView textView = this.f11992H;
        if (textView != null) {
            this.f12030c.addView(textView);
            this.f11992H.setVisibility(0);
        }
    }

    /* renamed from: g0 */
    private boolean m26416g0() {
        return !(getStartIconDrawable() == null && this.f12002M == null) && this.f12032d.getMeasuredWidth() > 0;
    }

    private AbstractC4792e getEndIconDelegate() {
        AbstractC4792e abstractC4792e = this.f12053v0.get(this.f12052u0);
        return abstractC4792e != null ? abstractC4792e : this.f12053v0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f11993H0.getVisibility() == 0) {
            return this.f11993H0;
        }
        if (m26447I() && m26445K()) {
            return this.f12055w0;
        }
        return null;
    }

    /* renamed from: h */
    private void m26415h() {
        if (this.f12054w == null || this.f12027a0 != 1) {
            return;
        }
        if (C9321c.m15046h(getContext())) {
            EditText editText = this.f12054w;
            C7759x.m17560D0(editText, C7759x.m17551I(editText), getResources().getDimensionPixelSize(C9267d.material_filled_edittext_font_2_0_padding_top), C7759x.m17553H(this.f12054w), getResources().getDimensionPixelSize(C9267d.material_filled_edittext_font_2_0_padding_bottom));
        } else if (C9321c.m15047g(getContext())) {
            EditText editText2 = this.f12054w;
            C7759x.m17560D0(editText2, C7759x.m17551I(editText2), getResources().getDimensionPixelSize(C9267d.material_filled_edittext_font_1_3_padding_top), C7759x.m17553H(this.f12054w), getResources().getDimensionPixelSize(C9267d.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    /* renamed from: h0 */
    private boolean m26414h0() {
        EditText editText = this.f12054w;
        return (editText == null || this.f12016T == null || editText.getBackground() != null || this.f12027a0 == 0) ? false : true;
    }

    /* renamed from: i0 */
    private void m26412i0() {
        TextView textView = this.f11992H;
        if (textView == null || !this.f11990G) {
            return;
        }
        textView.setText(this.f11988F);
        this.f11992H.setVisibility(0);
        this.f11992H.bringToFront();
    }

    /* renamed from: j */
    private void m26411j() {
        C9243g c9243g = this.f12016T;
        if (c9243g == null) {
            return;
        }
        c9243g.setShapeAppearanceModel(this.f12020V);
        if (m26385w()) {
            this.f12016T.m15400d0(this.f12031c0, this.f12037f0);
        }
        int m26397q = m26397q();
        this.f12038g0 = m26397q;
        this.f12016T.m15409X(ColorStateList.valueOf(m26397q));
        if (this.f12052u0 == 3) {
            this.f12054w.getBackground().invalidateSelf();
        }
        m26409k();
        invalidate();
    }

    /* renamed from: j0 */
    private void m26410j0(boolean z) {
        if (z && getEndIconDrawable() != null) {
            Drawable mutate = C1365a.m36184r(getEndIconDrawable()).mutate();
            C1365a.m36188n(mutate, this.f12058y.m26294o());
            this.f12055w0.setImageDrawable(mutate);
            return;
        }
        m26405m();
    }

    /* renamed from: k */
    private void m26409k() {
        if (this.f12018U == null) {
            return;
        }
        if (m26383x()) {
            this.f12018U.m15409X(ColorStateList.valueOf(this.f12037f0));
        }
        invalidate();
    }

    /* renamed from: k0 */
    private void m26408k0() {
        if (this.f12027a0 == 1) {
            if (C9321c.m15046h(getContext())) {
                this.f12029b0 = getResources().getDimensionPixelSize(C9267d.material_font_2_0_box_collapsed_padding_top);
            } else if (C9321c.m15047g(getContext())) {
                this.f12029b0 = getResources().getDimensionPixelSize(C9267d.material_font_1_3_box_collapsed_padding_top);
            }
        }
    }

    /* renamed from: l */
    private void m26407l(RectF rectF) {
        float f = rectF.left;
        int i = this.f12022W;
        rectF.left = f - i;
        rectF.top -= i;
        rectF.right += i;
        rectF.bottom += i;
    }

    /* renamed from: l0 */
    private void m26406l0(Rect rect) {
        C9243g c9243g = this.f12018U;
        if (c9243g != null) {
            int i = rect.bottom;
            c9243g.setBounds(rect.left, i - this.f12035e0, rect.right, i);
        }
    }

    /* renamed from: m */
    private void m26405m() {
        m26403n(this.f12055w0, this.f12061z0, this.f12059y0, this.f11981B0, this.f11979A0);
    }

    /* renamed from: m0 */
    private void m26404m0() {
        if (this.f11982C != null) {
            EditText editText = this.f12054w;
            m26402n0(editText == null ? 0 : editText.getText().length());
        }
    }

    /* renamed from: n */
    private void m26403n(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = C1365a.m36184r(drawable).mutate();
            if (z) {
                C1365a.m36187o(drawable, colorStateList);
            }
            if (z2) {
                C1365a.m36186p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: o */
    private void m26401o() {
        m26403n(this.f12043l0, this.f12045n0, this.f12044m0, this.f12047p0, this.f12046o0);
    }

    /* renamed from: o0 */
    private static void m26400o0(Context context, TextView textView, int i, int i2, boolean z) {
        textView.setContentDescription(context.getString(z ? C9275j.character_counter_overflowed_content_description : C9275j.character_counter_content_description, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    /* renamed from: p */
    private void m26399p() {
        int i = this.f12027a0;
        if (i == 0) {
            this.f12016T = null;
            this.f12018U = null;
        } else if (i == 1) {
            this.f12016T = new C9243g(this.f12020V);
            this.f12018U = new C9243g();
        } else if (i == 2) {
            if (this.f12010Q && !(this.f12016T instanceof C4778c)) {
                this.f12016T = new C4778c(this.f12020V);
            } else {
                this.f12016T = new C9243g(this.f12020V);
            }
            this.f12018U = null;
        } else {
            throw new IllegalArgumentException(this.f12027a0 + " is illegal; only @BoxBackgroundMode constants are supported.");
        }
    }

    /* renamed from: p0 */
    private void m26398p0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f11982C;
        if (textView != null) {
            m26420e0(textView, this.f11980B ? this.f11984D : this.f11986E);
            if (!this.f11980B && (colorStateList2 = this.f11998K) != null) {
                this.f11982C.setTextColor(colorStateList2);
            }
            if (!this.f11980B || (colorStateList = this.f12000L) == null) {
                return;
            }
            this.f11982C.setTextColor(colorStateList);
        }
    }

    /* renamed from: q */
    private int m26397q() {
        return this.f12027a0 == 1 ? C9310a.m15080e(C9310a.m15081d(this, C9233b.colorSurface, 0), this.f12038g0) : this.f12038g0;
    }

    /* renamed from: q0 */
    private boolean m26396q0() {
        boolean z;
        if (this.f12054w == null) {
            return false;
        }
        boolean z2 = true;
        if (m26416g0()) {
            int measuredWidth = this.f12032d.getMeasuredWidth() - this.f12054w.getPaddingLeft();
            if (this.f12048q0 == null || this.f12049r0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f12048q0 = colorDrawable;
                this.f12049r0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] m36105a = C1398i.m36105a(this.f12054w);
            Drawable drawable = m36105a[0];
            Drawable drawable2 = this.f12048q0;
            if (drawable != drawable2) {
                C1398i.m36094l(this.f12054w, drawable2, m36105a[1], m36105a[2], m36105a[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.f12048q0 != null) {
                Drawable[] m36105a2 = C1398i.m36105a(this.f12054w);
                C1398i.m36094l(this.f12054w, null, m36105a2[1], m36105a2[2], m36105a2[3]);
                this.f12048q0 = null;
                z = true;
            }
            z = false;
        }
        if (m26418f0()) {
            int measuredWidth2 = this.f12008P.getMeasuredWidth() - this.f12054w.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = measuredWidth2 + endIconToUpdateDummyDrawable.getMeasuredWidth() + C7713h.m17730b((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams());
            }
            Drawable[] m36105a3 = C1398i.m36105a(this.f12054w);
            Drawable drawable3 = this.f11983C0;
            if (drawable3 != null && this.f11985D0 != measuredWidth2) {
                this.f11985D0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                C1398i.m36094l(this.f12054w, m36105a3[0], m36105a3[1], this.f11983C0, m36105a3[3]);
            } else {
                if (this.f11983C0 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.f11983C0 = colorDrawable2;
                    this.f11985D0 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = m36105a3[2];
                Drawable drawable5 = this.f11983C0;
                if (drawable4 != drawable5) {
                    this.f11987E0 = m36105a3[2];
                    C1398i.m36094l(this.f12054w, m36105a3[0], m36105a3[1], drawable5, m36105a3[3]);
                } else {
                    z2 = z;
                }
            }
        } else if (this.f11983C0 == null) {
            return z;
        } else {
            Drawable[] m36105a4 = C1398i.m36105a(this.f12054w);
            if (m36105a4[2] == this.f11983C0) {
                C1398i.m36094l(this.f12054w, m36105a4[0], m36105a4[1], this.f11987E0, m36105a4[3]);
            } else {
                z2 = z;
            }
            this.f11983C0 = null;
        }
        return z2;
    }

    /* renamed from: r */
    private Rect m26395r(Rect rect) {
        if (this.f12054w != null) {
            Rect rect2 = this.f12040i0;
            boolean z = C7759x.m17563C(this) == 1;
            rect2.bottom = rect.bottom;
            int i = this.f12027a0;
            if (i == 1) {
                rect2.left = m26449G(rect.left, z);
                rect2.top = rect.top + this.f12029b0;
                rect2.right = m26448H(rect.right, z);
                return rect2;
            } else if (i != 2) {
                rect2.left = m26449G(rect.left, z);
                rect2.top = getPaddingTop();
                rect2.right = m26448H(rect.right, z);
                return rect2;
            } else {
                rect2.left = rect.left + this.f12054w.getPaddingLeft();
                rect2.top = rect.top - m26387v();
                rect2.right = rect.right - this.f12054w.getPaddingRight();
                return rect2;
            }
        }
        throw new IllegalStateException();
    }

    /* renamed from: s */
    private int m26393s(Rect rect, Rect rect2, float f) {
        if (m26440P()) {
            return (int) (rect2.top + f);
        }
        return rect.bottom - this.f12054w.getCompoundPaddingBottom();
    }

    /* renamed from: s0 */
    private boolean m26392s0() {
        int max;
        if (this.f12054w != null && this.f12054w.getMeasuredHeight() < (max = Math.max(this.f12034e.getMeasuredHeight(), this.f12032d.getMeasuredHeight()))) {
            this.f12054w.setMinimumHeight(max);
            return true;
        }
        return false;
    }

    private void setEditText(EditText editText) {
        if (this.f12054w == null) {
            if (this.f12052u0 != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f12054w = editText;
            m26437S();
            setTextInputAccessibilityDelegate(new C4761e(this));
            this.f12021V0.m26804k0(this.f12054w.getTypeface());
            this.f12021V0.m26824a0(this.f12054w.getTextSize());
            int gravity = this.f12054w.getGravity();
            this.f12021V0.m26834R((gravity & (-113)) | 48);
            this.f12021V0.m26826Z(gravity);
            this.f12054w.addTextChangedListener(new C4757a());
            if (this.f11997J0 == null) {
                this.f11997J0 = this.f12054w.getHintTextColors();
            }
            if (this.f12010Q) {
                if (TextUtils.isEmpty(this.f12012R)) {
                    CharSequence hint = this.f12054w.getHint();
                    this.f12056x = hint;
                    setHint(hint);
                    this.f12054w.setHint((CharSequence) null);
                }
                this.f12014S = true;
            }
            if (this.f11982C != null) {
                m26402n0(this.f12054w.getText().length());
            }
            m26394r0();
            this.f12058y.m26304e();
            this.f12032d.bringToFront();
            this.f12034e.bringToFront();
            this.f12036f.bringToFront();
            this.f11993H0.bringToFront();
            m26458B();
            m26378z0();
            m26455C0();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            m26386v0(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setErrorIconVisible(boolean z) {
        this.f11993H0.setVisibility(z ? 0 : 8);
        this.f12036f.setVisibility(z ? 8 : 0);
        m26455C0();
        if (m26447I()) {
            return;
        }
        m26396q0();
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f12012R)) {
            return;
        }
        this.f12012R = charSequence;
        this.f12021V0.m26808i0(charSequence);
        if (this.f12019U0) {
            return;
        }
        m26436T();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f11990G == z) {
            return;
        }
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f11992H = appCompatTextView;
            appCompatTextView.setId(C9271f.textinput_placeholder);
            C7759x.m17494r0(this.f11992H, 1);
            setPlaceholderTextAppearance(this.f11996J);
            setPlaceholderTextColor(this.f11994I);
            m26417g();
        } else {
            m26430Z();
            this.f11992H = null;
        }
        this.f11990G = z;
    }

    /* renamed from: t */
    private int m26391t(Rect rect, float f) {
        if (m26440P()) {
            return (int) (rect.centerY() - (f / 2.0f));
        }
        return rect.top + this.f12054w.getCompoundPaddingTop();
    }

    /* renamed from: t0 */
    private void m26390t0() {
        if (this.f12027a0 != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f12030c.getLayoutParams();
            int m26387v = m26387v();
            if (m26387v != layoutParams.topMargin) {
                layoutParams.topMargin = m26387v;
                this.f12030c.requestLayout();
            }
        }
    }

    /* renamed from: u */
    private Rect m26389u(Rect rect) {
        if (this.f12054w != null) {
            Rect rect2 = this.f12040i0;
            float m26790x = this.f12021V0.m26790x();
            rect2.left = rect.left + this.f12054w.getCompoundPaddingLeft();
            rect2.top = m26391t(rect, m26790x);
            rect2.right = rect.right - this.f12054w.getCompoundPaddingRight();
            rect2.bottom = m26393s(rect, rect2, m26790x);
            return rect2;
        }
        throw new IllegalStateException();
    }

    /* renamed from: v */
    private int m26387v() {
        float m26798p;
        if (this.f12010Q) {
            int i = this.f12027a0;
            if (i == 0 || i == 1) {
                m26798p = this.f12021V0.m26798p();
            } else if (i != 2) {
                return 0;
            } else {
                m26798p = this.f12021V0.m26798p() / 2.0f;
            }
            return (int) m26798p;
        }
        return 0;
    }

    /* renamed from: v0 */
    private void m26386v0(boolean z, boolean z2) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f12054w;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f12054w;
        boolean z4 = editText2 != null && editText2.hasFocus();
        boolean m26298k = this.f12058y.m26298k();
        ColorStateList colorStateList2 = this.f11997J0;
        if (colorStateList2 != null) {
            this.f12021V0.m26835Q(colorStateList2);
            this.f12021V0.m26827Y(this.f11997J0);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f11997J0;
            int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f12017T0) : this.f12017T0;
            this.f12021V0.m26835Q(ColorStateList.valueOf(colorForState));
            this.f12021V0.m26827Y(ColorStateList.valueOf(colorForState));
        } else if (m26298k) {
            this.f12021V0.m26835Q(this.f12058y.m26293p());
        } else if (this.f11980B && (textView = this.f11982C) != null) {
            this.f12021V0.m26835Q(textView.getTextColors());
        } else if (z4 && (colorStateList = this.f11999K0) != null) {
            this.f12021V0.m26835Q(colorStateList);
        }
        if (!z3 && this.f12023W0 && (!isEnabled() || !z4)) {
            if (z2 || !this.f12019U0) {
                m26450F(z);
            }
        } else if (z2 || this.f12019U0) {
            m26379z(z);
        }
    }

    /* renamed from: w */
    private boolean m26385w() {
        return this.f12027a0 == 2 && m26383x();
    }

    /* renamed from: w0 */
    private void m26384w0() {
        EditText editText;
        if (this.f11992H == null || (editText = this.f12054w) == null) {
            return;
        }
        this.f11992H.setGravity(editText.getGravity());
        this.f11992H.setPadding(this.f12054w.getCompoundPaddingLeft(), this.f12054w.getCompoundPaddingTop(), this.f12054w.getCompoundPaddingRight(), this.f12054w.getCompoundPaddingBottom());
    }

    /* renamed from: x */
    private boolean m26383x() {
        return this.f12031c0 > -1 && this.f12037f0 != 0;
    }

    /* renamed from: x0 */
    private void m26382x0() {
        EditText editText = this.f12054w;
        m26380y0(editText == null ? 0 : editText.getText().length());
    }

    /* renamed from: y */
    private void m26381y() {
        if (m26460A()) {
            ((C4778c) this.f12016T).m26362n0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y0 */
    public void m26380y0(int i) {
        if (i == 0 && !this.f12019U0) {
            m26412i0();
        } else {
            m26446J();
        }
    }

    /* renamed from: z */
    private void m26379z(boolean z) {
        ValueAnimator valueAnimator = this.f12025Y0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f12025Y0.cancel();
        }
        if (z && this.f12024X0) {
            m26413i(1.0f);
        } else {
            this.f12021V0.m26818d0(1.0f);
        }
        this.f12019U0 = false;
        if (m26460A()) {
            m26436T();
        }
        m26382x0();
        m26459A0();
        m26453D0();
    }

    /* renamed from: z0 */
    private void m26378z0() {
        if (this.f12054w == null) {
            return;
        }
        C7759x.m17560D0(this.f12004N, m26439Q() ? 0 : C7759x.m17551I(this.f12054w), this.f12054w.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(C9267d.material_input_text_to_prefix_suffix_padding), this.f12054w.getCompoundPaddingBottom());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E0 */
    public void m26451E0() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.f12016T == null || this.f12027a0 == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.f12054w) != null && editText2.hasFocus());
        boolean z3 = isHovered() || ((editText = this.f12054w) != null && editText.isHovered());
        if (!isEnabled()) {
            this.f12037f0 = this.f12017T0;
        } else if (this.f12058y.m26298k()) {
            if (this.f12007O0 != null) {
                m26457B0(z2, z3);
            } else {
                this.f12037f0 = this.f12058y.m26294o();
            }
        } else if (!this.f11980B || (textView = this.f11982C) == null) {
            if (z2) {
                this.f12037f0 = this.f12005N0;
            } else if (z3) {
                this.f12037f0 = this.f12003M0;
            } else {
                this.f12037f0 = this.f12001L0;
            }
        } else if (this.f12007O0 != null) {
            m26457B0(z2, z3);
        } else {
            this.f12037f0 = textView.getCurrentTextColor();
        }
        if (getErrorIconDrawable() != null && this.f12058y.m26285x() && this.f12058y.m26298k()) {
            z = true;
        }
        setErrorIconVisible(z);
        m26433W();
        m26431Y();
        m26434V();
        if (getEndIconDelegate().mo26324d()) {
            m26410j0(this.f12058y.m26298k());
        }
        if (z2 && isEnabled()) {
            this.f12031c0 = this.f12035e0;
        } else {
            this.f12031c0 = this.f12033d0;
        }
        if (this.f12027a0 == 1) {
            if (!isEnabled()) {
                this.f12038g0 = this.f12011Q0;
            } else if (z3 && !z2) {
                this.f12038g0 = this.f12015S0;
            } else if (z2) {
                this.f12038g0 = this.f12013R0;
            } else {
                this.f12038g0 = this.f12009P0;
            }
        }
        m26411j();
    }

    /* renamed from: K */
    public boolean m26445K() {
        return this.f12036f.getVisibility() == 0 && this.f12055w0.getVisibility() == 0;
    }

    /* renamed from: M */
    public boolean m26443M() {
        return this.f12058y.m26284y();
    }

    /* renamed from: N */
    final boolean m26442N() {
        return this.f12019U0;
    }

    /* renamed from: O */
    public boolean m26441O() {
        return this.f12014S;
    }

    /* renamed from: Q */
    public boolean m26439Q() {
        return this.f12043l0.getVisibility() == 0;
    }

    /* renamed from: V */
    public void m26434V() {
        m26432X(this.f12055w0, this.f12059y0);
    }

    /* renamed from: W */
    public void m26433W() {
        m26432X(this.f11993H0, this.f11995I0);
    }

    /* renamed from: Y */
    public void m26431Y() {
        m26432X(this.f12043l0, this.f12044m0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            this.f12030c.addView(view, layoutParams2);
            this.f12030c.setLayoutParams(layoutParams);
            m26390t0();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f12054w;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f12056x != null) {
            boolean z = this.f12014S;
            this.f12014S = false;
            CharSequence hint = editText.getHint();
            this.f12054w.setHint(this.f12056x);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f12054w.setHint(hint);
                this.f12014S = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        viewStructure.setChildCount(this.f12030c.getChildCount());
        for (int i2 = 0; i2 < this.f12030c.getChildCount(); i2++) {
            View childAt = this.f12030c.getChildAt(i2);
            ViewStructure newChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.f12054w) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f12028a1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f12028a1 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        m26452E(canvas);
        m26454D(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f12026Z0) {
            return;
        }
        boolean z = true;
        this.f12026Z0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C4657a c4657a = this.f12021V0;
        boolean m26810h0 = c4657a != null ? c4657a.m26810h0(drawableState) | false : false;
        if (this.f12054w != null) {
            m26388u0((C7759x.m17535U(this) && isEnabled()) ? false : false);
        }
        m26394r0();
        m26451E0();
        if (m26810h0) {
            invalidate();
        }
        this.f12026Z0 = false;
    }

    /* renamed from: e */
    public void m26421e(InterfaceC4762f interfaceC4762f) {
        this.f12051t0.add(interfaceC4762f);
        if (this.f12054w != null) {
            interfaceC4762f.mo26272a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r3.getTextColors().getDefaultColor() == (-65281)) goto L8;
     */
    /* renamed from: e0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m26420e0(android.widget.TextView r3, int r4) {
        /*
            r2 = this;
            r0 = 1
            androidx.core.widget.C1398i.m36089q(r3, r4)     // Catch: java.lang.Exception -> L1b
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L1b
            r1 = 23
            if (r4 < r1) goto L18
            android.content.res.ColorStateList r4 = r3.getTextColors()     // Catch: java.lang.Exception -> L1b
            int r4 = r4.getDefaultColor()     // Catch: java.lang.Exception -> L1b
            r1 = -65281(0xffffffffffff00ff, float:NaN)
            if (r4 != r1) goto L18
            goto L1c
        L18:
            r4 = 0
            r0 = 0
            goto L1c
        L1b:
        L1c:
            if (r0 == 0) goto L30
            int r4 = p272h.p286c.p287a.p323c.C9276k.TextAppearance_AppCompat_Caption
            androidx.core.widget.C1398i.m36089q(r3, r4)
            android.content.Context r4 = r2.getContext()
            int r0 = p272h.p286c.p287a.p323c.C9236c.design_error
            int r4 = androidx.core.content.C1335a.m36324d(r4, r0)
            r3.setTextColor(r4)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m26420e0(android.widget.TextView, int):void");
    }

    /* renamed from: f */
    public void m26419f(InterfaceC4763g interfaceC4763g) {
        this.f12057x0.add(interfaceC4763g);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f12054w;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + m26387v();
        }
        return super.getBaseline();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9243g getBoxBackground() {
        int i = this.f12027a0;
        if (i != 1 && i != 2) {
            throw new IllegalStateException();
        }
        return this.f12016T;
    }

    public int getBoxBackgroundColor() {
        return this.f12038g0;
    }

    public int getBoxBackgroundMode() {
        return this.f12027a0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.f12016T.m15379s();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.f12016T.m15378t();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.f12016T.m15426G();
    }

    public float getBoxCornerRadiusTopStart() {
        return this.f12016T.m15427F();
    }

    public int getBoxStrokeColor() {
        return this.f12005N0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f12007O0;
    }

    public int getBoxStrokeWidth() {
        return this.f12033d0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f12035e0;
    }

    public int getCounterMaxLength() {
        return this.f11978A;
    }

    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f12060z && this.f11980B && (textView = this.f11982C) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f11998K;
    }

    public ColorStateList getCounterTextColor() {
        return this.f11998K;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f11997J0;
    }

    public EditText getEditText() {
        return this.f12054w;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f12055w0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f12055w0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f12052u0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CheckableImageButton getEndIconView() {
        return this.f12055w0;
    }

    public CharSequence getError() {
        if (this.f12058y.m26285x()) {
            return this.f12058y.m26295n();
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f12058y.m26296m();
    }

    public int getErrorCurrentTextColors() {
        return this.f12058y.m26294o();
    }

    public Drawable getErrorIconDrawable() {
        return this.f11993H0.getDrawable();
    }

    final int getErrorTextCurrentColor() {
        return this.f12058y.m26294o();
    }

    public CharSequence getHelperText() {
        if (this.f12058y.m26284y()) {
            return this.f12058y.m26292q();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f12058y.m26291r();
    }

    public CharSequence getHint() {
        if (this.f12010Q) {
            return this.f12012R;
        }
        return null;
    }

    final float getHintCollapsedTextHeight() {
        return this.f12021V0.m26798p();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.f12021V0.m26794t();
    }

    public ColorStateList getHintTextColor() {
        return this.f11999K0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f12055w0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f12055w0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f11990G) {
            return this.f11988F;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f11996J;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f11994I;
    }

    public CharSequence getPrefixText() {
        return this.f12002M;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f12004N.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f12004N;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f12043l0.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f12043l0.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.f12006O;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f12008P.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f12008P;
    }

    public Typeface getTypeface() {
        return this.f12042k0;
    }

    /* renamed from: i */
    void m26413i(float f) {
        if (this.f12021V0.m26788z() == f) {
            return;
        }
        if (this.f12025Y0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f12025Y0 = valueAnimator;
            valueAnimator.setInterpolator(C9278a.f21807b);
            this.f12025Y0.setDuration(167L);
            this.f12025Y0.addUpdateListener(new C4760d());
        }
        this.f12025Y0.setFloatValues(this.f12021V0.m26788z(), f);
        this.f12025Y0.start();
    }

    /* renamed from: n0 */
    void m26402n0(int i) {
        boolean z = this.f11980B;
        int i2 = this.f11978A;
        if (i2 == -1) {
            this.f11982C.setText(String.valueOf(i));
            this.f11982C.setContentDescription(null);
            this.f11980B = false;
        } else {
            this.f11980B = i > i2;
            m26400o0(getContext(), this.f11982C, i, this.f11978A, this.f11980B);
            if (z != this.f11980B) {
                m26398p0();
            }
            this.f11982C.setText(C7651a.m17925c().m17918j(getContext().getString(C9275j.character_counter_pattern, Integer.valueOf(i), Integer.valueOf(this.f11978A))));
        }
        if (this.f12054w == null || z == this.f11980B) {
            return;
        }
        m26388u0(false);
        m26451E0();
        m26394r0();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f12054w;
        if (editText != null) {
            Rect rect = this.f12039h0;
            C4661c.m26786a(this, editText, rect);
            m26406l0(rect);
            if (this.f12010Q) {
                this.f12021V0.m26824a0(this.f12054w.getTextSize());
                int gravity = this.f12054w.getGravity();
                this.f12021V0.m26834R((gravity & (-113)) | 48);
                this.f12021V0.m26826Z(gravity);
                this.f12021V0.m26838N(m26395r(rect));
                this.f12021V0.m26830V(m26389u(rect));
                this.f12021V0.m26841K();
                if (!m26460A() || this.f12019U0) {
                    return;
                }
                m26436T();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean m26392s0 = m26392s0();
        boolean m26396q0 = m26396q0();
        if (m26392s0 || m26396q0) {
            this.f12054w.post(new RunnableC4759c());
        }
        m26384w0();
        m26378z0();
        m26455C0();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C4764h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C4764h c4764h = (C4764h) parcelable;
        super.onRestoreInstanceState(c4764h.m17424a());
        setError(c4764h.f12067e);
        if (c4764h.f12068f) {
            this.f12055w0.post(new RunnableC4758b());
        }
        setHint(c4764h.f12069w);
        setHelperText(c4764h.f12070x);
        setPlaceholderText(c4764h.f12071y);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C4764h c4764h = new C4764h(super.onSaveInstanceState());
        if (this.f12058y.m26298k()) {
            c4764h.f12067e = getError();
        }
        c4764h.f12068f = m26447I() && this.f12055w0.isChecked();
        c4764h.f12069w = getHint();
        c4764h.f12070x = getHelperText();
        c4764h.f12071y = getPlaceholderText();
        return c4764h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r0 */
    public void m26394r0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f12054w;
        if (editText == null || this.f12027a0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (C1068a0.m37285a(background)) {
            background = background.mutate();
        }
        if (this.f12058y.m26298k()) {
            background.setColorFilter(C1111i.m37131e(this.f12058y.m26294o(), PorterDuff.Mode.SRC_IN));
        } else if (this.f11980B && (textView = this.f11982C) != null) {
            background.setColorFilter(C1111i.m37131e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            C1365a.m36199c(background);
            this.f12054w.refreshDrawableState();
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f12038g0 != i) {
            this.f12038g0 = i;
            this.f12009P0 = i;
            this.f12013R0 = i;
            this.f12015S0 = i;
            m26411j();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(C1335a.m36324d(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f12009P0 = defaultColor;
        this.f12038g0 = defaultColor;
        this.f12011Q0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f12013R0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f12015S0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        m26411j();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f12027a0) {
            return;
        }
        this.f12027a0 = i;
        if (this.f12054w != null) {
            m26437S();
        }
    }

    public void setBoxStrokeColor(int i) {
        if (this.f12005N0 != i) {
            this.f12005N0 = i;
            m26451E0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f12001L0 = colorStateList.getDefaultColor();
            this.f12017T0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f12003M0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.f12005N0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.f12005N0 != colorStateList.getDefaultColor()) {
            this.f12005N0 = colorStateList.getDefaultColor();
        }
        m26451E0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f12007O0 != colorStateList) {
            this.f12007O0 = colorStateList;
            m26451E0();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f12033d0 = i;
        m26451E0();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f12035e0 = i;
        m26451E0();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f12060z != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f11982C = appCompatTextView;
                appCompatTextView.setId(C9271f.textinput_counter);
                Typeface typeface = this.f12042k0;
                if (typeface != null) {
                    this.f11982C.setTypeface(typeface);
                }
                this.f11982C.setMaxLines(1);
                this.f12058y.m26305d(this.f11982C, 2);
                C7713h.m17728d((ViewGroup.MarginLayoutParams) this.f11982C.getLayoutParams(), getResources().getDimensionPixelOffset(C9267d.mtrl_textinput_counter_margin_start));
                m26398p0();
                m26404m0();
            } else {
                this.f12058y.m26283z(this.f11982C, 2);
                this.f11982C = null;
            }
            this.f12060z = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f11978A != i) {
            if (i > 0) {
                this.f11978A = i;
            } else {
                this.f11978A = -1;
            }
            if (this.f12060z) {
                m26404m0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f11984D != i) {
            this.f11984D = i;
            m26398p0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f12000L != colorStateList) {
            this.f12000L = colorStateList;
            m26398p0();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f11986E != i) {
            this.f11986E = i;
            m26398p0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f11998K != colorStateList) {
            this.f11998K = colorStateList;
            m26398p0();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f11997J0 = colorStateList;
        this.f11999K0 = colorStateList;
        if (this.f12054w != null) {
            m26388u0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m26435U(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f12055w0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f12055w0.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? C7462a.m18690d(getContext(), i) : null);
    }

    public void setEndIconMode(int i) {
        int i2 = this.f12052u0;
        this.f12052u0 = i;
        m26456C(i2);
        setEndIconVisible(i != 0);
        if (getEndIconDelegate().mo26326b(this.f12027a0)) {
            getEndIconDelegate().mo26277a();
            m26405m();
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.f12027a0 + " is not supported by the end icon mode " + i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        m26424c0(this.f12055w0, onClickListener, this.f11989F0);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f11989F0 = onLongClickListener;
        m26422d0(this.f12055w0, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f12059y0 != colorStateList) {
            this.f12059y0 = colorStateList;
            this.f12061z0 = true;
            m26405m();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f11979A0 != mode) {
            this.f11979A0 = mode;
            this.f11981B0 = true;
            m26405m();
        }
    }

    public void setEndIconVisible(boolean z) {
        if (m26445K() != z) {
            this.f12055w0.setVisibility(z ? 0 : 8);
            m26455C0();
            m26396q0();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f12058y.m26285x()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            setErrorEnabled(true);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.f12058y.m26311M(charSequence);
        } else {
            this.f12058y.m26289t();
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f12058y.m26322B(charSequence);
    }

    public void setErrorEnabled(boolean z) {
        this.f12058y.m26321C(z);
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? C7462a.m18690d(getContext(), i) : null);
        m26433W();
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        m26424c0(this.f11993H0, onClickListener, this.f11991G0);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f11991G0 = onLongClickListener;
        m26422d0(this.f11993H0, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f11995I0 = colorStateList;
        Drawable drawable = this.f11993H0.getDrawable();
        if (drawable != null) {
            drawable = C1365a.m36184r(drawable).mutate();
            C1365a.m36187o(drawable, colorStateList);
        }
        if (this.f11993H0.getDrawable() != drawable) {
            this.f11993H0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f11993H0.getDrawable();
        if (drawable != null) {
            drawable = C1365a.m36184r(drawable).mutate();
            C1365a.m36186p(drawable, mode);
        }
        if (this.f11993H0.getDrawable() != drawable) {
            this.f11993H0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i) {
        this.f12058y.m26320D(i);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f12058y.m26319E(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.f12023W0 != z) {
            this.f12023W0 = z;
            m26388u0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (m26443M()) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!m26443M()) {
            setHelperTextEnabled(true);
        }
        this.f12058y.m26310N(charSequence);
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f12058y.m26316H(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.f12058y.m26317G(z);
    }

    public void setHelperTextTextAppearance(int i) {
        this.f12058y.m26318F(i);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f12010Q) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(IjkMediaMeta.FF_PROFILE_H264_INTRA);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f12024X0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f12010Q) {
            this.f12010Q = z;
            if (!z) {
                this.f12014S = false;
                if (!TextUtils.isEmpty(this.f12012R) && TextUtils.isEmpty(this.f12054w.getHint())) {
                    this.f12054w.setHint(this.f12012R);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.f12054w.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f12012R)) {
                        setHint(hint);
                    }
                    this.f12054w.setHint((CharSequence) null);
                }
                this.f12014S = true;
            }
            if (this.f12054w != null) {
                m26390t0();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.f12021V0.m26837O(i);
        this.f11999K0 = this.f12021V0.m26800n();
        if (this.f12054w != null) {
            m26388u0(false);
            m26390t0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f11999K0 != colorStateList) {
            if (this.f11997J0 == null) {
                this.f12021V0.m26835Q(colorStateList);
            }
            this.f11999K0 = colorStateList;
            if (this.f12054w != null) {
                m26388u0(false);
            }
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? C7462a.m18690d(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.f12052u0 != 1) {
            setEndIconMode(1);
        } else if (z) {
        } else {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f12059y0 = colorStateList;
        this.f12061z0 = true;
        m26405m();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f11979A0 = mode;
        this.f11981B0 = true;
        m26405m();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f11990G && TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f11990G) {
                setPlaceholderTextEnabled(true);
            }
            this.f11988F = charSequence;
        }
        m26382x0();
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f11996J = i;
        TextView textView = this.f11992H;
        if (textView != null) {
            C1398i.m36089q(textView, i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f11994I != colorStateList) {
            this.f11994I = colorStateList;
            TextView textView = this.f11992H;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f12002M = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f12004N.setText(charSequence);
        m26459A0();
    }

    public void setPrefixTextAppearance(int i) {
        C1398i.m36089q(this.f12004N, i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f12004N.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.f12043l0.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? C7462a.m18690d(getContext(), i) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        m26424c0(this.f12043l0, onClickListener, this.f12050s0);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f12050s0 = onLongClickListener;
        m26422d0(this.f12043l0, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.f12044m0 != colorStateList) {
            this.f12044m0 = colorStateList;
            this.f12045n0 = true;
            m26401o();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.f12046o0 != mode) {
            this.f12046o0 = mode;
            this.f12047p0 = true;
            m26401o();
        }
    }

    public void setStartIconVisible(boolean z) {
        if (m26439Q() != z) {
            this.f12043l0.setVisibility(z ? 0 : 8);
            m26378z0();
            m26396q0();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f12006O = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f12008P.setText(charSequence);
        m26453D0();
    }

    public void setSuffixTextAppearance(int i) {
        C1398i.m36089q(this.f12008P, i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f12008P.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C4761e c4761e) {
        EditText editText = this.f12054w;
        if (editText != null) {
            C7759x.m17498p0(editText, c4761e);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f12042k0) {
            this.f12042k0 = typeface;
            this.f12021V0.m26804k0(typeface);
            this.f12058y.m26314J(typeface);
            TextView textView = this.f11982C;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u0 */
    public void m26388u0(boolean z) {
        m26386v0(z, false);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(C4804a.m26258c(context, attributeSet, i, f11977b1), attributeSet, i);
        int i2;
        this.f12058y = new C4793f(this);
        this.f12039h0 = new Rect();
        this.f12040i0 = new Rect();
        this.f12041j0 = new RectF();
        this.f12051t0 = new LinkedHashSet<>();
        this.f12052u0 = 0;
        this.f12053v0 = new SparseArray<>();
        this.f12057x0 = new LinkedHashSet<>();
        this.f12021V0 = new C4657a(this);
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f12030c = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        addView(this.f12030c);
        LinearLayout linearLayout = new LinearLayout(context2);
        this.f12032d = linearLayout;
        linearLayout.setOrientation(0);
        this.f12032d.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        this.f12030c.addView(this.f12032d);
        LinearLayout linearLayout2 = new LinearLayout(context2);
        this.f12034e = linearLayout2;
        linearLayout2.setOrientation(0);
        this.f12034e.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        this.f12030c.addView(this.f12034e);
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f12036f = frameLayout2;
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        this.f12021V0.m26806j0(C9278a.f21806a);
        this.f12021V0.m26812g0(C9278a.f21806a);
        this.f12021V0.m26834R(8388659);
        C1138r0 m26689i = C4695q.m26689i(context2, attributeSet, C9277l.TextInputLayout, i, f11977b1, C9277l.TextInputLayout_counterTextAppearance, C9277l.TextInputLayout_counterOverflowTextAppearance, C9277l.TextInputLayout_errorTextAppearance, C9277l.TextInputLayout_helperTextTextAppearance, C9277l.TextInputLayout_hintTextAppearance);
        this.f12010Q = m26689i.m37047a(C9277l.TextInputLayout_hintEnabled, true);
        setHint(m26689i.m37032p(C9277l.TextInputLayout_android_hint));
        this.f12024X0 = m26689i.m37047a(C9277l.TextInputLayout_hintAnimationEnabled, true);
        this.f12023W0 = m26689i.m37047a(C9277l.TextInputLayout_expandedHintEnabled, true);
        this.f12020V = C9250k.m15359e(context2, attributeSet, i, f11977b1).m15320m();
        this.f12022W = context2.getResources().getDimensionPixelOffset(C9267d.mtrl_textinput_box_label_cutout_padding);
        this.f12029b0 = m26689i.m37043e(C9277l.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.f12033d0 = m26689i.m37042f(C9277l.TextInputLayout_boxStrokeWidth, context2.getResources().getDimensionPixelSize(C9267d.mtrl_textinput_box_stroke_width_default));
        this.f12035e0 = m26689i.m37042f(C9277l.TextInputLayout_boxStrokeWidthFocused, context2.getResources().getDimensionPixelSize(C9267d.mtrl_textinput_box_stroke_width_focused));
        this.f12031c0 = this.f12033d0;
        float m37044d = m26689i.m37044d(C9277l.TextInputLayout_boxCornerRadiusTopStart, -1.0f);
        float m37044d2 = m26689i.m37044d(C9277l.TextInputLayout_boxCornerRadiusTopEnd, -1.0f);
        float m37044d3 = m26689i.m37044d(C9277l.TextInputLayout_boxCornerRadiusBottomEnd, -1.0f);
        float m37044d4 = m26689i.m37044d(C9277l.TextInputLayout_boxCornerRadiusBottomStart, -1.0f);
        C9250k.C9252b m15342v = this.f12020V.m15342v();
        if (m37044d >= 0.0f) {
            m15342v.m15338A(m37044d);
        }
        if (m37044d2 >= 0.0f) {
            m15342v.m15334E(m37044d2);
        }
        if (m37044d3 >= 0.0f) {
            m15342v.m15310w(m37044d3);
        }
        if (m37044d4 >= 0.0f) {
            m15342v.m15314s(m37044d4);
        }
        this.f12020V = m15342v.m15320m();
        ColorStateList m15052b = C9321c.m15052b(context2, m26689i, C9277l.TextInputLayout_boxBackgroundColor);
        if (m15052b != null) {
            int defaultColor = m15052b.getDefaultColor();
            this.f12009P0 = defaultColor;
            this.f12038g0 = defaultColor;
            if (m15052b.isStateful()) {
                this.f12011Q0 = m15052b.getColorForState(new int[]{-16842910}, -1);
                this.f12013R0 = m15052b.getColorForState(new int[]{16842908, 16842910}, -1);
                this.f12015S0 = m15052b.getColorForState(new int[]{16843623, 16842910}, -1);
            } else {
                this.f12013R0 = this.f12009P0;
                ColorStateList m18691c = C7462a.m18691c(context2, C9236c.mtrl_filled_background_color);
                this.f12011Q0 = m18691c.getColorForState(new int[]{-16842910}, -1);
                this.f12015S0 = m18691c.getColorForState(new int[]{16843623}, -1);
            }
        } else {
            this.f12038g0 = 0;
            this.f12009P0 = 0;
            this.f12011Q0 = 0;
            this.f12013R0 = 0;
            this.f12015S0 = 0;
        }
        if (m26689i.m37029s(C9277l.TextInputLayout_android_textColorHint)) {
            ColorStateList m37045c = m26689i.m37045c(C9277l.TextInputLayout_android_textColorHint);
            this.f11999K0 = m37045c;
            this.f11997J0 = m37045c;
        }
        ColorStateList m15052b2 = C9321c.m15052b(context2, m26689i, C9277l.TextInputLayout_boxStrokeColor);
        this.f12005N0 = m26689i.m37046b(C9277l.TextInputLayout_boxStrokeColor, 0);
        this.f12001L0 = C1335a.m36324d(context2, C9236c.mtrl_textinput_default_box_stroke_color);
        this.f12017T0 = C1335a.m36324d(context2, C9236c.mtrl_textinput_disabled_color);
        this.f12003M0 = C1335a.m36324d(context2, C9236c.mtrl_textinput_hovered_box_stroke_color);
        if (m15052b2 != null) {
            setBoxStrokeColorStateList(m15052b2);
        }
        if (m26689i.m37029s(C9277l.TextInputLayout_boxStrokeErrorColor)) {
            setBoxStrokeErrorColor(C9321c.m15052b(context2, m26689i, C9277l.TextInputLayout_boxStrokeErrorColor));
        }
        if (m26689i.m37034n(C9277l.TextInputLayout_hintTextAppearance, -1) != -1) {
            setHintTextAppearance(m26689i.m37034n(C9277l.TextInputLayout_hintTextAppearance, 0));
        }
        int m37034n = m26689i.m37034n(C9277l.TextInputLayout_errorTextAppearance, 0);
        CharSequence m37032p = m26689i.m37032p(C9277l.TextInputLayout_errorContentDescription);
        boolean m37047a = m26689i.m37047a(C9277l.TextInputLayout_errorEnabled, false);
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C9273h.design_text_input_end_icon, (ViewGroup) this.f12034e, false);
        this.f11993H0 = checkableImageButton;
        checkableImageButton.setId(C9271f.text_input_error_icon);
        this.f11993H0.setVisibility(8);
        if (C9321c.m15047g(context2)) {
            C7713h.m17728d((ViewGroup.MarginLayoutParams) this.f11993H0.getLayoutParams(), 0);
        }
        if (m26689i.m37029s(C9277l.TextInputLayout_errorIconDrawable)) {
            setErrorIconDrawable(m26689i.m37041g(C9277l.TextInputLayout_errorIconDrawable));
        }
        if (m26689i.m37029s(C9277l.TextInputLayout_errorIconTint)) {
            setErrorIconTintList(C9321c.m15052b(context2, m26689i, C9277l.TextInputLayout_errorIconTint));
        }
        if (m26689i.m37029s(C9277l.TextInputLayout_errorIconTintMode)) {
            setErrorIconTintMode(C4696r.m26684e(m26689i.m37037k(C9277l.TextInputLayout_errorIconTintMode, -1), null));
        }
        this.f11993H0.setContentDescription(getResources().getText(C9275j.error_icon_content_description));
        C7759x.m17478z0(this.f11993H0, 2);
        this.f11993H0.setClickable(false);
        this.f11993H0.setPressable(false);
        this.f11993H0.setFocusable(false);
        int m37034n2 = m26689i.m37034n(C9277l.TextInputLayout_helperTextTextAppearance, 0);
        boolean m37047a2 = m26689i.m37047a(C9277l.TextInputLayout_helperTextEnabled, false);
        CharSequence m37032p2 = m26689i.m37032p(C9277l.TextInputLayout_helperText);
        int m37034n3 = m26689i.m37034n(C9277l.TextInputLayout_placeholderTextAppearance, 0);
        CharSequence m37032p3 = m26689i.m37032p(C9277l.TextInputLayout_placeholderText);
        int m37034n4 = m26689i.m37034n(C9277l.TextInputLayout_prefixTextAppearance, 0);
        CharSequence m37032p4 = m26689i.m37032p(C9277l.TextInputLayout_prefixText);
        int m37034n5 = m26689i.m37034n(C9277l.TextInputLayout_suffixTextAppearance, 0);
        CharSequence m37032p5 = m26689i.m37032p(C9277l.TextInputLayout_suffixText);
        boolean m37047a3 = m26689i.m37047a(C9277l.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(m26689i.m37037k(C9277l.TextInputLayout_counterMaxLength, -1));
        this.f11986E = m26689i.m37034n(C9277l.TextInputLayout_counterTextAppearance, 0);
        this.f11984D = m26689i.m37034n(C9277l.TextInputLayout_counterOverflowTextAppearance, 0);
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C9273h.design_text_input_start_icon, (ViewGroup) this.f12032d, false);
        this.f12043l0 = checkableImageButton2;
        checkableImageButton2.setVisibility(8);
        if (C9321c.m15047g(context2)) {
            C7713h.m17729c((ViewGroup.MarginLayoutParams) this.f12043l0.getLayoutParams(), 0);
        }
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        if (m26689i.m37029s(C9277l.TextInputLayout_startIconDrawable)) {
            setStartIconDrawable(m26689i.m37041g(C9277l.TextInputLayout_startIconDrawable));
            if (m26689i.m37029s(C9277l.TextInputLayout_startIconContentDescription)) {
                setStartIconContentDescription(m26689i.m37032p(C9277l.TextInputLayout_startIconContentDescription));
            }
            setStartIconCheckable(m26689i.m37047a(C9277l.TextInputLayout_startIconCheckable, true));
        }
        if (m26689i.m37029s(C9277l.TextInputLayout_startIconTint)) {
            setStartIconTintList(C9321c.m15052b(context2, m26689i, C9277l.TextInputLayout_startIconTint));
        }
        if (m26689i.m37029s(C9277l.TextInputLayout_startIconTintMode)) {
            setStartIconTintMode(C4696r.m26684e(m26689i.m37037k(C9277l.TextInputLayout_startIconTintMode, -1), null));
        }
        setBoxBackgroundMode(m26689i.m37037k(C9277l.TextInputLayout_boxBackgroundMode, 0));
        CheckableImageButton checkableImageButton3 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C9273h.design_text_input_end_icon, (ViewGroup) this.f12036f, false);
        this.f12055w0 = checkableImageButton3;
        this.f12036f.addView(checkableImageButton3);
        this.f12055w0.setVisibility(8);
        if (C9321c.m15047g(context2)) {
            i2 = 0;
            C7713h.m17728d((ViewGroup.MarginLayoutParams) this.f12055w0.getLayoutParams(), 0);
        } else {
            i2 = 0;
        }
        this.f12053v0.append(-1, new C4777b(this));
        this.f12053v0.append(i2, new C4797h(this));
        this.f12053v0.append(1, new C4798i(this));
        this.f12053v0.append(2, new C4766a(this));
        this.f12053v0.append(3, new C4779d(this));
        if (m26689i.m37029s(C9277l.TextInputLayout_endIconMode)) {
            setEndIconMode(m26689i.m37037k(C9277l.TextInputLayout_endIconMode, 0));
            if (m26689i.m37029s(C9277l.TextInputLayout_endIconDrawable)) {
                setEndIconDrawable(m26689i.m37041g(C9277l.TextInputLayout_endIconDrawable));
            }
            if (m26689i.m37029s(C9277l.TextInputLayout_endIconContentDescription)) {
                setEndIconContentDescription(m26689i.m37032p(C9277l.TextInputLayout_endIconContentDescription));
            }
            setEndIconCheckable(m26689i.m37047a(C9277l.TextInputLayout_endIconCheckable, true));
        } else if (m26689i.m37029s(C9277l.TextInputLayout_passwordToggleEnabled)) {
            setEndIconMode(m26689i.m37047a(C9277l.TextInputLayout_passwordToggleEnabled, false) ? 1 : 0);
            setEndIconDrawable(m26689i.m37041g(C9277l.TextInputLayout_passwordToggleDrawable));
            setEndIconContentDescription(m26689i.m37032p(C9277l.TextInputLayout_passwordToggleContentDescription));
            if (m26689i.m37029s(C9277l.TextInputLayout_passwordToggleTint)) {
                setEndIconTintList(C9321c.m15052b(context2, m26689i, C9277l.TextInputLayout_passwordToggleTint));
            }
            if (m26689i.m37029s(C9277l.TextInputLayout_passwordToggleTintMode)) {
                setEndIconTintMode(C4696r.m26684e(m26689i.m37037k(C9277l.TextInputLayout_passwordToggleTintMode, -1), null));
            }
        }
        if (!m26689i.m37029s(C9277l.TextInputLayout_passwordToggleEnabled)) {
            if (m26689i.m37029s(C9277l.TextInputLayout_endIconTint)) {
                setEndIconTintList(C9321c.m15052b(context2, m26689i, C9277l.TextInputLayout_endIconTint));
            }
            if (m26689i.m37029s(C9277l.TextInputLayout_endIconTintMode)) {
                setEndIconTintMode(C4696r.m26684e(m26689i.m37037k(C9277l.TextInputLayout_endIconTintMode, -1), null));
            }
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(context2);
        this.f12004N = appCompatTextView;
        appCompatTextView.setId(C9271f.textinput_prefix_text);
        this.f12004N.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        C7759x.m17494r0(this.f12004N, 1);
        this.f12032d.addView(this.f12043l0);
        this.f12032d.addView(this.f12004N);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context2);
        this.f12008P = appCompatTextView2;
        appCompatTextView2.setId(C9271f.textinput_suffix_text);
        this.f12008P.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        C7759x.m17494r0(this.f12008P, 1);
        this.f12034e.addView(this.f12008P);
        this.f12034e.addView(this.f11993H0);
        this.f12034e.addView(this.f12036f);
        setHelperTextEnabled(m37047a2);
        setHelperText(m37032p2);
        setHelperTextTextAppearance(m37034n2);
        setErrorEnabled(m37047a);
        setErrorTextAppearance(m37034n);
        setErrorContentDescription(m37032p);
        setCounterTextAppearance(this.f11986E);
        setCounterOverflowTextAppearance(this.f11984D);
        setPlaceholderText(m37032p3);
        setPlaceholderTextAppearance(m37034n3);
        setPrefixText(m37032p4);
        setPrefixTextAppearance(m37034n4);
        setSuffixText(m37032p5);
        setSuffixTextAppearance(m37034n5);
        if (m26689i.m37029s(C9277l.TextInputLayout_errorTextColor)) {
            setErrorTextColor(m26689i.m37045c(C9277l.TextInputLayout_errorTextColor));
        }
        if (m26689i.m37029s(C9277l.TextInputLayout_helperTextTextColor)) {
            setHelperTextColor(m26689i.m37045c(C9277l.TextInputLayout_helperTextTextColor));
        }
        if (m26689i.m37029s(C9277l.TextInputLayout_hintTextColor)) {
            setHintTextColor(m26689i.m37045c(C9277l.TextInputLayout_hintTextColor));
        }
        if (m26689i.m37029s(C9277l.TextInputLayout_counterTextColor)) {
            setCounterTextColor(m26689i.m37045c(C9277l.TextInputLayout_counterTextColor));
        }
        if (m26689i.m37029s(C9277l.TextInputLayout_counterOverflowTextColor)) {
            setCounterOverflowTextColor(m26689i.m37045c(C9277l.TextInputLayout_counterOverflowTextColor));
        }
        if (m26689i.m37029s(C9277l.TextInputLayout_placeholderTextColor)) {
            setPlaceholderTextColor(m26689i.m37045c(C9277l.TextInputLayout_placeholderTextColor));
        }
        if (m26689i.m37029s(C9277l.TextInputLayout_prefixTextColor)) {
            setPrefixTextColor(m26689i.m37045c(C9277l.TextInputLayout_prefixTextColor));
        }
        if (m26689i.m37029s(C9277l.TextInputLayout_suffixTextColor)) {
            setSuffixTextColor(m26689i.m37045c(C9277l.TextInputLayout_suffixTextColor));
        }
        setCounterEnabled(m37047a3);
        setEnabled(m26689i.m37047a(C9277l.TextInputLayout_android_enabled, true));
        m26689i.m37025w();
        C7759x.m17478z0(this, 2);
        if (Build.VERSION.SDK_INT >= 26) {
            C7759x.m17566A0(this, 1);
        }
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f12055w0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f12055w0.setImageDrawable(drawable);
        m26434V();
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.f12043l0.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f12043l0.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            m26431Y();
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        setStartIconContentDescription((CharSequence) null);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f11993H0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.f12058y.m26285x());
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f12055w0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f12055w0.setImageDrawable(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }
}
