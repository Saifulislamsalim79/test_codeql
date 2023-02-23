package p201g.p202a.p205l.p206a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.C1103h0;
import androidx.core.content.p057e.C1364g;
import androidx.core.graphics.drawable.InterfaceC1366b;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p201g.p202a.p205l.p206a.C7472b;
import p201g.p202a.p205l.p206a.C7479e;
import p201g.p202a.p207m.C7482b;
import p201g.p218e.C7526d;
import p201g.p218e.C7535h;
import p201g.p267w.p268a.p269a.C8189c;
import p201g.p267w.p268a.p269a.C8199i;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: AnimatedStateListDrawableCompat.java */
/* renamed from: g.a.l.a.a */
/* loaded from: classes2.dex */
public class C7464a extends C7479e implements InterfaceC1366b {

    /* renamed from: G */
    private C7467c f17678G;

    /* renamed from: H */
    private AbstractC7471g f17679H;

    /* renamed from: I */
    private int f17680I;

    /* renamed from: J */
    private int f17681J;

    /* renamed from: K */
    private boolean f17682K;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* renamed from: g.a.l.a.a$b */
    /* loaded from: classes2.dex */
    public static class C7466b extends AbstractC7471g {

        /* renamed from: a */
        private final Animatable f17683a;

        C7466b(Animatable animatable) {
            super();
            this.f17683a = animatable;
        }

        @Override // p201g.p202a.p205l.p206a.C7464a.AbstractC7471g
        /* renamed from: c */
        public void mo18665c() {
            this.f17683a.start();
        }

        @Override // p201g.p202a.p205l.p206a.C7464a.AbstractC7471g
        /* renamed from: d */
        public void mo18664d() {
            this.f17683a.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* renamed from: g.a.l.a.a$c */
    /* loaded from: classes2.dex */
    public static class C7467c extends C7479e.C7480a {

        /* renamed from: K */
        C7526d<Long> f17684K;

        /* renamed from: L */
        C7535h<Integer> f17685L;

        C7467c(C7467c c7467c, C7464a c7464a, Resources resources) {
            super(c7467c, c7464a, resources);
            if (c7467c != null) {
                this.f17684K = c7467c.f17684K;
                this.f17685L = c7467c.f17685L;
                return;
            }
            this.f17684K = new C7526d<>();
            this.f17685L = new C7535h<>();
        }

        /* renamed from: D */
        private static long m18675D(int i, int i2) {
            return i2 | (i << 32);
        }

        /* renamed from: B */
        int m18677B(int[] iArr, Drawable drawable, int i) {
            int m18611z = super.m18611z(iArr, drawable);
            this.f17685L.m18439i(m18611z, Integer.valueOf(i));
            return m18611z;
        }

        /* renamed from: C */
        int m18676C(int i, int i2, Drawable drawable, boolean z) {
            int m18651a = super.m18651a(drawable);
            long m18675D = m18675D(i, i2);
            long j = z ? IjkMediaMeta.AV_CH_SURROUND_DIRECT_LEFT : 0L;
            long j2 = m18651a;
            this.f17684K.m18504a(m18675D, Long.valueOf(j2 | j));
            if (z) {
                this.f17684K.m18504a(m18675D(i2, i), Long.valueOf(IjkMediaMeta.AV_CH_WIDE_RIGHT | j2 | j));
            }
            return m18651a;
        }

        /* renamed from: E */
        int m18674E(int i) {
            if (i < 0) {
                return 0;
            }
            return this.f17685L.m18442f(i, 0).intValue();
        }

        /* renamed from: F */
        int m18673F(int[] iArr) {
            int m18614A = super.m18614A(iArr);
            return m18614A >= 0 ? m18614A : super.m18614A(StateSet.WILD_CARD);
        }

        /* renamed from: G */
        int m18672G(int i, int i2) {
            return (int) this.f17684K.m18498g(m18675D(i, i2), -1L).longValue();
        }

        /* renamed from: H */
        boolean m18671H(int i, int i2) {
            return (this.f17684K.m18498g(m18675D(i, i2), -1L).longValue() & IjkMediaMeta.AV_CH_WIDE_RIGHT) != 0;
        }

        /* renamed from: I */
        boolean m18670I(int i, int i2) {
            return (this.f17684K.m18498g(m18675D(i, i2), -1L).longValue() & IjkMediaMeta.AV_CH_SURROUND_DIRECT_LEFT) != 0;
        }

        @Override // p201g.p202a.p205l.p206a.C7479e.C7480a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C7464a(this, null);
        }

        @Override // p201g.p202a.p205l.p206a.C7479e.C7480a, p201g.p202a.p205l.p206a.C7472b.AbstractC7476d
        /* renamed from: r */
        void mo18612r() {
            this.f17684K = this.f17684K.clone();
            this.f17685L = this.f17685L.clone();
        }

        @Override // p201g.p202a.p205l.p206a.C7479e.C7480a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C7464a(this, resources);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* renamed from: g.a.l.a.a$d */
    /* loaded from: classes2.dex */
    public static class C7468d extends AbstractC7471g {

        /* renamed from: a */
        private final C8189c f17686a;

        C7468d(C8189c c8189c) {
            super();
            this.f17686a = c8189c;
        }

        @Override // p201g.p202a.p205l.p206a.C7464a.AbstractC7471g
        /* renamed from: c */
        public void mo18665c() {
            this.f17686a.start();
        }

        @Override // p201g.p202a.p205l.p206a.C7464a.AbstractC7471g
        /* renamed from: d */
        public void mo18664d() {
            this.f17686a.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* renamed from: g.a.l.a.a$e */
    /* loaded from: classes2.dex */
    public static class C7469e extends AbstractC7471g {

        /* renamed from: a */
        private final ObjectAnimator f17687a;

        /* renamed from: b */
        private final boolean f17688b;

        C7469e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            C7470f c7470f = new C7470f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            if (Build.VERSION.SDK_INT >= 18) {
                ofInt.setAutoCancel(true);
            }
            ofInt.setDuration(c7470f.m18669a());
            ofInt.setInterpolator(c7470f);
            this.f17688b = z2;
            this.f17687a = ofInt;
        }

        @Override // p201g.p202a.p205l.p206a.C7464a.AbstractC7471g
        /* renamed from: a */
        public boolean mo18667a() {
            return this.f17688b;
        }

        @Override // p201g.p202a.p205l.p206a.C7464a.AbstractC7471g
        /* renamed from: b */
        public void mo18666b() {
            this.f17687a.reverse();
        }

        @Override // p201g.p202a.p205l.p206a.C7464a.AbstractC7471g
        /* renamed from: c */
        public void mo18665c() {
            this.f17687a.start();
        }

        @Override // p201g.p202a.p205l.p206a.C7464a.AbstractC7471g
        /* renamed from: d */
        public void mo18664d() {
            this.f17687a.cancel();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* renamed from: g.a.l.a.a$f */
    /* loaded from: classes2.dex */
    private static class C7470f implements TimeInterpolator {

        /* renamed from: a */
        private int[] f17689a;

        /* renamed from: b */
        private int f17690b;

        /* renamed from: c */
        private int f17691c;

        C7470f(AnimationDrawable animationDrawable, boolean z) {
            m18668b(animationDrawable, z);
        }

        /* renamed from: a */
        int m18669a() {
            return this.f17691c;
        }

        /* renamed from: b */
        int m18668b(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f17690b = numberOfFrames;
            int[] iArr = this.f17689a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f17689a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f17689a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f17691c = i;
            return i;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            int i = (int) ((f * this.f17691c) + 0.5f);
            int i2 = this.f17690b;
            int[] iArr = this.f17689a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (i3 / i2) + (i3 < i2 ? i / this.f17691c : 0.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* renamed from: g.a.l.a.a$g */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC7471g {
        private AbstractC7471g() {
        }

        /* renamed from: a */
        public boolean mo18667a() {
            return false;
        }

        /* renamed from: b */
        public void mo18666b() {
        }

        /* renamed from: c */
        public abstract void mo18665c();

        /* renamed from: d */
        public abstract void mo18664d();
    }

    public C7464a() {
        this(null, null);
    }

    /* renamed from: m */
    public static C7464a m18685m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C7464a c7464a = new C7464a();
            c7464a.m18684n(context, resources, xmlPullParser, attributeSet, theme);
            return c7464a;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    /* renamed from: o */
    private void m18683o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals("item")) {
                    m18681q(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals("transition")) {
                    m18680r(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    /* renamed from: p */
    private void m18682p() {
        onStateChange(getState());
    }

    /* renamed from: q */
    private int m18681q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray m36221k = C1364g.m36221k(resources, theme, attributeSet, C7482b.AnimatedStateListDrawableItem);
        int resourceId = m36221k.getResourceId(C7482b.AnimatedStateListDrawableItem_android_id, 0);
        int resourceId2 = m36221k.getResourceId(C7482b.AnimatedStateListDrawableItem_android_drawable, -1);
        Drawable m37154j = resourceId2 > 0 ? C1103h0.m37156h().m37154j(context, resourceId2) : null;
        m36221k.recycle();
        int[] m18615k = m18615k(attributeSet);
        if (m37154j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                if (xmlPullParser.getName().equals("vector")) {
                    m37154j = C8199i.m16519c(resources, xmlPullParser, attributeSet, theme);
                } else if (Build.VERSION.SDK_INT >= 21) {
                    m37154j = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                } else {
                    m37154j = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
                }
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
        }
        if (m37154j != null) {
            return this.f17678G.m18677B(m18615k, m37154j, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    /* renamed from: r */
    private int m18680r(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray m36221k = C1364g.m36221k(resources, theme, attributeSet, C7482b.AnimatedStateListDrawableTransition);
        int resourceId = m36221k.getResourceId(C7482b.AnimatedStateListDrawableTransition_android_fromId, -1);
        int resourceId2 = m36221k.getResourceId(C7482b.AnimatedStateListDrawableTransition_android_toId, -1);
        int resourceId3 = m36221k.getResourceId(C7482b.AnimatedStateListDrawableTransition_android_drawable, -1);
        Drawable m37154j = resourceId3 > 0 ? C1103h0.m37156h().m37154j(context, resourceId3) : null;
        boolean z = m36221k.getBoolean(C7482b.AnimatedStateListDrawableTransition_android_reversible, false);
        m36221k.recycle();
        if (m37154j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                if (xmlPullParser.getName().equals("animated-vector")) {
                    m37154j = C8189c.m16552a(context, resources, xmlPullParser, attributeSet, theme);
                } else if (Build.VERSION.SDK_INT >= 21) {
                    m37154j = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                } else {
                    m37154j = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
                }
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
        }
        if (m37154j == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.f17678G.m18676C(resourceId, resourceId2, m37154j, z);
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
    }

    /* renamed from: s */
    private boolean m18679s(int i) {
        int m18662c;
        int m18672G;
        AbstractC7471g c7466b;
        AbstractC7471g abstractC7471g = this.f17679H;
        if (abstractC7471g != null) {
            if (i == this.f17680I) {
                return true;
            }
            if (i == this.f17681J && abstractC7471g.mo18667a()) {
                abstractC7471g.mo18666b();
                this.f17680I = this.f17681J;
                this.f17681J = i;
                return true;
            }
            m18662c = this.f17680I;
            abstractC7471g.mo18664d();
        } else {
            m18662c = m18662c();
        }
        this.f17679H = null;
        this.f17681J = -1;
        this.f17680I = -1;
        C7467c c7467c = this.f17678G;
        int m18674E = c7467c.m18674E(m18662c);
        int m18674E2 = c7467c.m18674E(i);
        if (m18674E2 == 0 || m18674E == 0 || (m18672G = c7467c.m18672G(m18674E, m18674E2)) < 0) {
            return false;
        }
        boolean m18670I = c7467c.m18670I(m18674E, m18674E2);
        m18658g(m18672G);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            c7466b = new C7469e((AnimationDrawable) current, c7467c.m18671H(m18674E, m18674E2), m18670I);
        } else if (current instanceof C8189c) {
            c7466b = new C7468d((C8189c) current);
        } else {
            if (current instanceof Animatable) {
                c7466b = new C7466b((Animatable) current);
            }
            return false;
        }
        c7466b.mo18665c();
        this.f17679H = c7466b;
        this.f17681J = m18662c;
        this.f17680I = i;
        return true;
    }

    /* renamed from: t */
    private void m18678t(TypedArray typedArray) {
        C7467c c7467c = this.f17678G;
        if (Build.VERSION.SDK_INT >= 21) {
            c7467c.f17718d |= typedArray.getChangingConfigurations();
        }
        c7467c.m18630x(typedArray.getBoolean(C7482b.AnimatedStateListDrawableCompat_android_variablePadding, c7467c.f17723i));
        c7467c.m18634t(typedArray.getBoolean(C7482b.AnimatedStateListDrawableCompat_android_constantSize, c7467c.f17726l));
        c7467c.m18633u(typedArray.getInt(C7482b.AnimatedStateListDrawableCompat_android_enterFadeDuration, c7467c.f17706A));
        c7467c.m18632v(typedArray.getInt(C7482b.AnimatedStateListDrawableCompat_android_exitFadeDuration, c7467c.f17707B));
        setDither(typedArray.getBoolean(C7482b.AnimatedStateListDrawableCompat_android_dither, c7467c.f17738x));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p201g.p202a.p205l.p206a.C7479e, p201g.p202a.p205l.p206a.C7472b
    /* renamed from: h */
    public void mo18617h(C7472b.AbstractC7476d abstractC7476d) {
        super.mo18617h(abstractC7476d);
        if (abstractC7476d instanceof C7467c) {
            this.f17678G = (C7467c) abstractC7476d;
        }
    }

    @Override // p201g.p202a.p205l.p206a.C7479e, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // p201g.p202a.p205l.p206a.C7472b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        AbstractC7471g abstractC7471g = this.f17679H;
        if (abstractC7471g != null) {
            abstractC7471g.mo18664d();
            this.f17679H = null;
            m18658g(this.f17680I);
            this.f17680I = -1;
            this.f17681J = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p201g.p202a.p205l.p206a.C7479e
    /* renamed from: l */
    public C7467c mo18616j() {
        return new C7467c(this.f17678G, this, null);
    }

    @Override // p201g.p202a.p205l.p206a.C7479e, p201g.p202a.p205l.p206a.C7472b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f17682K) {
            super.mutate();
            if (this == this) {
                this.f17678G.mo18612r();
                this.f17682K = true;
            }
        }
        return this;
    }

    /* renamed from: n */
    public void m18684n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray m36221k = C1364g.m36221k(resources, theme, attributeSet, C7482b.AnimatedStateListDrawableCompat);
        setVisible(m36221k.getBoolean(C7482b.AnimatedStateListDrawableCompat_android_visible, true), true);
        m18678t(m36221k);
        m18657i(resources);
        m36221k.recycle();
        m18683o(context, resources, xmlPullParser, attributeSet, theme);
        m18682p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p201g.p202a.p205l.p206a.C7479e, p201g.p202a.p205l.p206a.C7472b, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int m18673F = this.f17678G.m18673F(iArr);
        boolean z = m18673F != m18662c() && (m18679s(m18673F) || m18658g(m18673F));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    @Override // p201g.p202a.p205l.p206a.C7472b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.f17679H != null && (visible || z2)) {
            if (z) {
                this.f17679H.mo18665c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    C7464a(C7467c c7467c, Resources resources) {
        super(null);
        this.f17680I = -1;
        this.f17681J = -1;
        mo18617h(new C7467c(c7467c, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}
