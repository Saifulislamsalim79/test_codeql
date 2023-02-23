package p272h.p286c.p287a.p323c.p329n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.internal.C4689n;
import com.google.android.material.internal.C4695q;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import p201g.p227h.p238l.C7759x;
import p272h.p286c.p287a.p323c.C9233b;
import p272h.p286c.p287a.p323c.C9267d;
import p272h.p286c.p287a.p323c.C9271f;
import p272h.p286c.p287a.p323c.C9274i;
import p272h.p286c.p287a.p323c.C9275j;
import p272h.p286c.p287a.p323c.C9276k;
import p272h.p286c.p287a.p323c.C9277l;
import p272h.p286c.p287a.p323c.p326c0.C9243g;
import p272h.p286c.p287a.p323c.p342z.C9321c;
import p272h.p286c.p287a.p323c.p342z.C9322d;
/* compiled from: BadgeDrawable.java */
/* renamed from: h.c.a.c.n.a */
/* loaded from: classes2.dex */
public class C9289a extends Drawable implements C4689n.InterfaceC4691b {

    /* renamed from: I */
    private static final int f21829I = C9276k.Widget_MaterialComponents_Badge;

    /* renamed from: J */
    private static final int f21830J = C9233b.badgeStyle;

    /* renamed from: A */
    private float f21831A;

    /* renamed from: B */
    private float f21832B;

    /* renamed from: C */
    private int f21833C;

    /* renamed from: D */
    private float f21834D;

    /* renamed from: E */
    private float f21835E;

    /* renamed from: F */
    private float f21836F;

    /* renamed from: G */
    private WeakReference<View> f21837G;

    /* renamed from: H */
    private WeakReference<FrameLayout> f21838H;

    /* renamed from: c */
    private final WeakReference<Context> f21839c;

    /* renamed from: d */
    private final C9243g f21840d;

    /* renamed from: e */
    private final C4689n f21841e;

    /* renamed from: f */
    private final Rect f21842f;

    /* renamed from: w */
    private final float f21843w;

    /* renamed from: x */
    private final float f21844x;

    /* renamed from: y */
    private final float f21845y;

    /* renamed from: z */
    private final C9291b f21846z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BadgeDrawable.java */
    /* renamed from: h.c.a.c.n.a$a */
    /* loaded from: classes2.dex */
    public class RunnableC9290a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ View f21847c;

        /* renamed from: d */
        final /* synthetic */ FrameLayout f21848d;

        RunnableC9290a(View view, FrameLayout frameLayout) {
            this.f21847c = view;
            this.f21848d = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            C9289a.this.m15203D(this.f21847c, this.f21848d);
        }
    }

    private C9289a(Context context) {
        this.f21839c = new WeakReference<>(context);
        C4695q.m26695c(context);
        Resources resources = context.getResources();
        this.f21842f = new Rect();
        this.f21840d = new C9243g();
        this.f21843w = resources.getDimensionPixelSize(C9267d.mtrl_badge_radius);
        this.f21845y = resources.getDimensionPixelSize(C9267d.mtrl_badge_long_text_horizontal_padding);
        this.f21844x = resources.getDimensionPixelSize(C9267d.mtrl_badge_with_text_radius);
        C4689n c4689n = new C4689n(this);
        this.f21841e = c4689n;
        c4689n.m26704e().setTextAlign(Paint.Align.CENTER);
        this.f21846z = new C9291b(context);
        m15176y(C9276k.TextAppearance_MaterialComponents_Badge);
    }

    /* renamed from: B */
    private void m15205B(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != C9271f.mtrl_anchor_parent) {
            WeakReference<FrameLayout> weakReference = this.f21838H;
            if (weakReference == null || weakReference.get() != viewGroup) {
                m15204C(view);
                FrameLayout frameLayout = new FrameLayout(view.getContext());
                frameLayout.setId(C9271f.mtrl_anchor_parent);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.setLayoutParams(view.getLayoutParams());
                frameLayout.setMinimumWidth(view.getWidth());
                frameLayout.setMinimumHeight(view.getHeight());
                int indexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeViewAt(indexOfChild);
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(view);
                viewGroup.addView(frameLayout, indexOfChild);
                this.f21838H = new WeakReference<>(frameLayout);
                frameLayout.post(new RunnableC9290a(view, frameLayout));
            }
        }
    }

    /* renamed from: C */
    private static void m15204C(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    /* renamed from: E */
    private void m15202E() {
        Context context = this.f21839c.get();
        WeakReference<View> weakReference = this.f21837G;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f21842f);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference<FrameLayout> weakReference2 = this.f21838H;
        FrameLayout frameLayout = weakReference2 != null ? weakReference2.get() : null;
        if (frameLayout != null || C9293b.f21862a) {
            if (frameLayout == null) {
                frameLayout = (ViewGroup) view.getParent();
            }
            frameLayout.offsetDescendantRectToMyCoords(view, rect2);
        }
        m15199b(context, rect2, view);
        C9293b.m15146f(this.f21842f, this.f21831A, this.f21832B, this.f21835E, this.f21836F);
        this.f21840d.m15412U(this.f21834D);
        if (rect.equals(this.f21842f)) {
            return;
        }
        this.f21840d.setBounds(this.f21842f);
    }

    /* renamed from: F */
    private void m15201F() {
        double d;
        Double.isNaN(m15190k());
        this.f21833C = ((int) Math.pow(10.0d, d - 1.0d)) - 1;
    }

    /* renamed from: b */
    private void m15199b(Context context, Rect rect, View view) {
        int i = this.f21846z.f21850A;
        if (i == 8388691 || i == 8388693) {
            this.f21832B = rect.bottom - this.f21846z.f21853D;
        } else {
            this.f21832B = rect.top + this.f21846z.f21853D;
        }
        if (m15189l() <= 9) {
            float f = !m15187n() ? this.f21843w : this.f21844x;
            this.f21834D = f;
            this.f21836F = f;
            this.f21835E = f;
        } else {
            float f2 = this.f21844x;
            this.f21834D = f2;
            this.f21836F = f2;
            this.f21835E = (this.f21841e.m26703f(m15193h()) / 2.0f) + this.f21845y;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(m15187n() ? C9267d.mtrl_badge_text_horizontal_edge_offset : C9267d.mtrl_badge_horizontal_edge_offset);
        int i2 = this.f21846z.f21850A;
        if (i2 != 8388659 && i2 != 8388691) {
            this.f21831A = C7759x.m17563C(view) == 0 ? ((rect.right + this.f21835E) - dimensionPixelSize) - this.f21846z.f21852C : (rect.left - this.f21835E) + dimensionPixelSize + this.f21846z.f21852C;
        } else {
            this.f21831A = C7759x.m17563C(view) == 0 ? (rect.left - this.f21835E) + dimensionPixelSize + this.f21846z.f21852C : ((rect.right + this.f21835E) - dimensionPixelSize) - this.f21846z.f21852C;
        }
    }

    /* renamed from: d */
    public static C9289a m15197d(Context context) {
        return m15196e(context, null, f21830J, f21829I);
    }

    /* renamed from: e */
    private static C9289a m15196e(Context context, AttributeSet attributeSet, int i, int i2) {
        C9289a c9289a = new C9289a(context);
        c9289a.m15186o(context, attributeSet, i, i2);
        return c9289a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static C9289a m15195f(Context context, C9291b c9291b) {
        C9289a c9289a = new C9289a(context);
        c9289a.m15184q(c9291b);
        return c9289a;
    }

    /* renamed from: g */
    private void m15194g(Canvas canvas) {
        Rect rect = new Rect();
        String m15193h = m15193h();
        this.f21841e.m26704e().getTextBounds(m15193h, 0, m15193h.length(), rect);
        canvas.drawText(m15193h, this.f21831A, this.f21832B + (rect.height() / 2), this.f21841e.m26704e());
    }

    /* renamed from: h */
    private String m15193h() {
        if (m15189l() <= this.f21833C) {
            return NumberFormat.getInstance().format(m15189l());
        }
        Context context = this.f21839c.get();
        return context == null ? "" : context.getString(C9275j.mtrl_exceed_max_badge_number_suffix, Integer.valueOf(this.f21833C), "+");
    }

    /* renamed from: o */
    private void m15186o(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray m26690h = C4695q.m26690h(context, attributeSet, C9277l.Badge, i, i2, new int[0]);
        m15179v(m26690h.getInt(C9277l.Badge_maxCharacterCount, 4));
        if (m26690h.hasValue(C9277l.Badge_number)) {
            m15178w(m26690h.getInt(C9277l.Badge_number, 0));
        }
        m15183r(m15185p(context, m26690h, C9277l.Badge_backgroundColor));
        if (m26690h.hasValue(C9277l.Badge_badgeTextColor)) {
            m15181t(m15185p(context, m26690h, C9277l.Badge_badgeTextColor));
        }
        m15182s(m26690h.getInt(C9277l.Badge_badgeGravity, 8388661));
        m15180u(m26690h.getDimensionPixelOffset(C9277l.Badge_horizontalOffset, 0));
        m15175z(m26690h.getDimensionPixelOffset(C9277l.Badge_verticalOffset, 0));
        m26690h.recycle();
    }

    /* renamed from: p */
    private static int m15185p(Context context, TypedArray typedArray, int i) {
        return C9321c.m15053a(context, typedArray, i).getDefaultColor();
    }

    /* renamed from: q */
    private void m15184q(C9291b c9291b) {
        m15179v(c9291b.f21858w);
        if (c9291b.f21857f != -1) {
            m15178w(c9291b.f21857f);
        }
        m15183r(c9291b.f21854c);
        m15181t(c9291b.f21855d);
        m15182s(c9291b.f21850A);
        m15180u(c9291b.f21852C);
        m15175z(c9291b.f21853D);
        m15206A(c9291b.f21851B);
    }

    /* renamed from: x */
    private void m15177x(C9322d c9322d) {
        Context context;
        if (this.f21841e.m26705d() == c9322d || (context = this.f21839c.get()) == null) {
            return;
        }
        this.f21841e.m26701h(c9322d, context);
        m15202E();
    }

    /* renamed from: y */
    private void m15176y(int i) {
        Context context = this.f21839c.get();
        if (context == null) {
            return;
        }
        m15177x(new C9322d(context, i));
    }

    /* renamed from: A */
    public void m15206A(boolean z) {
        setVisible(z, false);
        this.f21846z.f21851B = z;
        if (!C9293b.f21862a || m15191j() == null || z) {
            return;
        }
        ((ViewGroup) m15191j().getParent()).invalidate();
    }

    /* renamed from: D */
    public void m15203D(View view, FrameLayout frameLayout) {
        this.f21837G = new WeakReference<>(view);
        if (C9293b.f21862a && frameLayout == null) {
            m15205B(view);
        } else {
            this.f21838H = new WeakReference<>(frameLayout);
        }
        if (!C9293b.f21862a) {
            m15204C(view);
        }
        m15202E();
        invalidateSelf();
    }

    @Override // com.google.android.material.internal.C4689n.InterfaceC4691b
    /* renamed from: a */
    public void mo15200a() {
        invalidateSelf();
    }

    /* renamed from: c */
    public void m15198c() {
        this.f21846z.f21857f = -1;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f21840d.draw(canvas);
        if (m15187n()) {
            m15194g(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f21846z.f21856e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f21842f.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f21842f.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* renamed from: i */
    public CharSequence m15192i() {
        Context context;
        if (isVisible()) {
            if (m15187n()) {
                if (this.f21846z.f21860y <= 0 || (context = this.f21839c.get()) == null) {
                    return null;
                }
                if (m15189l() <= this.f21833C) {
                    return context.getResources().getQuantityString(this.f21846z.f21860y, m15189l(), Integer.valueOf(m15189l()));
                }
                return context.getString(this.f21846z.f21861z, Integer.valueOf(this.f21833C));
            }
            return this.f21846z.f21859x;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    /* renamed from: j */
    public FrameLayout m15191j() {
        WeakReference<FrameLayout> weakReference = this.f21838H;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: k */
    public int m15190k() {
        return this.f21846z.f21858w;
    }

    /* renamed from: l */
    public int m15189l() {
        if (m15187n()) {
            return this.f21846z.f21857f;
        }
        return 0;
    }

    /* renamed from: m */
    public C9291b m15188m() {
        return this.f21846z;
    }

    /* renamed from: n */
    public boolean m15187n() {
        return this.f21846z.f21857f != -1;
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.C4689n.InterfaceC4691b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    /* renamed from: r */
    public void m15183r(int i) {
        this.f21846z.f21854c = i;
        ColorStateList valueOf = ColorStateList.valueOf(i);
        if (this.f21840d.m15374x() != valueOf) {
            this.f21840d.m15409X(valueOf);
            invalidateSelf();
        }
    }

    /* renamed from: s */
    public void m15182s(int i) {
        if (this.f21846z.f21850A != i) {
            this.f21846z.f21850A = i;
            WeakReference<View> weakReference = this.f21837G;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            View view = this.f21837G.get();
            WeakReference<FrameLayout> weakReference2 = this.f21838H;
            m15203D(view, weakReference2 != null ? weakReference2.get() : null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f21846z.f21856e = i;
        this.f21841e.m26704e().setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* renamed from: t */
    public void m15181t(int i) {
        this.f21846z.f21855d = i;
        if (this.f21841e.m26704e().getColor() != i) {
            this.f21841e.m26704e().setColor(i);
            invalidateSelf();
        }
    }

    /* renamed from: u */
    public void m15180u(int i) {
        this.f21846z.f21852C = i;
        m15202E();
    }

    /* renamed from: v */
    public void m15179v(int i) {
        if (this.f21846z.f21858w != i) {
            this.f21846z.f21858w = i;
            m15201F();
            this.f21841e.m26700i(true);
            m15202E();
            invalidateSelf();
        }
    }

    /* renamed from: w */
    public void m15178w(int i) {
        int max = Math.max(0, i);
        if (this.f21846z.f21857f != max) {
            this.f21846z.f21857f = max;
            this.f21841e.m26700i(true);
            m15202E();
            invalidateSelf();
        }
    }

    /* renamed from: z */
    public void m15175z(int i) {
        this.f21846z.f21853D = i;
        m15202E();
    }

    /* compiled from: BadgeDrawable.java */
    /* renamed from: h.c.a.c.n.a$b */
    /* loaded from: classes2.dex */
    public static final class C9291b implements Parcelable {
        public static final Parcelable.Creator<C9291b> CREATOR = new C9292a();

        /* renamed from: A */
        private int f21850A;

        /* renamed from: B */
        private boolean f21851B;

        /* renamed from: C */
        private int f21852C;

        /* renamed from: D */
        private int f21853D;

        /* renamed from: c */
        private int f21854c;

        /* renamed from: d */
        private int f21855d;

        /* renamed from: e */
        private int f21856e;

        /* renamed from: f */
        private int f21857f;

        /* renamed from: w */
        private int f21858w;

        /* renamed from: x */
        private CharSequence f21859x;

        /* renamed from: y */
        private int f21860y;

        /* renamed from: z */
        private int f21861z;

        /* compiled from: BadgeDrawable.java */
        /* renamed from: h.c.a.c.n.a$b$a */
        /* loaded from: classes2.dex */
        static class C9292a implements Parcelable.Creator<C9291b> {
            C9292a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C9291b createFromParcel(Parcel parcel) {
                return new C9291b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public C9291b[] newArray(int i) {
                return new C9291b[i];
            }
        }

        public C9291b(Context context) {
            this.f21856e = 255;
            this.f21857f = -1;
            this.f21855d = new C9322d(context, C9276k.TextAppearance_MaterialComponents_Badge).f21904a.getDefaultColor();
            this.f21859x = context.getString(C9275j.mtrl_badge_numberless_content_description);
            this.f21860y = C9274i.mtrl_badge_content_description;
            this.f21861z = C9275j.mtrl_exceed_max_badge_number_content_description;
            this.f21851B = true;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f21854c);
            parcel.writeInt(this.f21855d);
            parcel.writeInt(this.f21856e);
            parcel.writeInt(this.f21857f);
            parcel.writeInt(this.f21858w);
            parcel.writeString(this.f21859x.toString());
            parcel.writeInt(this.f21860y);
            parcel.writeInt(this.f21850A);
            parcel.writeInt(this.f21852C);
            parcel.writeInt(this.f21853D);
            parcel.writeInt(this.f21851B ? 1 : 0);
        }

        protected C9291b(Parcel parcel) {
            this.f21856e = 255;
            this.f21857f = -1;
            this.f21854c = parcel.readInt();
            this.f21855d = parcel.readInt();
            this.f21856e = parcel.readInt();
            this.f21857f = parcel.readInt();
            this.f21858w = parcel.readInt();
            this.f21859x = parcel.readString();
            this.f21860y = parcel.readInt();
            this.f21850A = parcel.readInt();
            this.f21852C = parcel.readInt();
            this.f21853D = parcel.readInt();
            this.f21851B = parcel.readInt() != 0;
        }
    }
}
