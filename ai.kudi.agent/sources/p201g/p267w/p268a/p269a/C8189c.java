package p201g.p267w.p268a.p269a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.content.p057e.C1364g;
import androidx.core.graphics.drawable.C1365a;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p201g.p218e.C7521a;
/* compiled from: AnimatedVectorDrawableCompat.java */
/* renamed from: g.w.a.a.c */
/* loaded from: classes2.dex */
public class C8189c extends AbstractC8198h implements Animatable {

    /* renamed from: d */
    private C8191b f19659d;

    /* renamed from: e */
    private Context f19660e;

    /* renamed from: f */
    private ArgbEvaluator f19661f;

    /* renamed from: w */
    final Drawable.Callback f19662w;

    /* compiled from: AnimatedVectorDrawableCompat.java */
    /* renamed from: g.w.a.a.c$a */
    /* loaded from: classes2.dex */
    class C8190a implements Drawable.Callback {
        C8190a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            C8189c.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C8189c.this.scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C8189c.this.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnimatedVectorDrawableCompat.java */
    /* renamed from: g.w.a.a.c$b */
    /* loaded from: classes2.dex */
    public static class C8191b extends Drawable.ConstantState {

        /* renamed from: a */
        int f19664a;

        /* renamed from: b */
        C8199i f19665b;

        /* renamed from: c */
        AnimatorSet f19666c;

        /* renamed from: d */
        ArrayList<Animator> f19667d;

        /* renamed from: e */
        C7521a<Animator, String> f19668e;

        public C8191b(Context context, C8191b c8191b, Drawable.Callback callback, Resources resources) {
            if (c8191b != null) {
                this.f19664a = c8191b.f19664a;
                C8199i c8199i = c8191b.f19665b;
                if (c8199i != null) {
                    Drawable.ConstantState constantState = c8199i.getConstantState();
                    if (resources != null) {
                        this.f19665b = (C8199i) constantState.newDrawable(resources);
                    } else {
                        this.f19665b = (C8199i) constantState.newDrawable();
                    }
                    C8199i c8199i2 = this.f19665b;
                    c8199i2.mutate();
                    C8199i c8199i3 = c8199i2;
                    this.f19665b = c8199i3;
                    c8199i3.setCallback(callback);
                    this.f19665b.setBounds(c8191b.f19665b.getBounds());
                    this.f19665b.m16514h(false);
                }
                ArrayList<Animator> arrayList = c8191b.f19667d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f19667d = new ArrayList<>(size);
                    this.f19668e = new C7521a<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = c8191b.f19667d.get(i);
                        Animator clone = animator.clone();
                        String str = c8191b.f19668e.get(animator);
                        clone.setTarget(this.f19665b.m16518d(str));
                        this.f19667d.add(clone);
                        this.f19668e.put(clone, str);
                    }
                    m16549a();
                }
            }
        }

        /* renamed from: a */
        public void m16549a() {
            if (this.f19666c == null) {
                this.f19666c = new AnimatorSet();
            }
            this.f19666c.playTogether(this.f19667d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f19664a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    C8189c() {
        this(null, null, null);
    }

    /* renamed from: a */
    public static C8189c m16552a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C8189c c8189c = new C8189c(context);
        c8189c.inflate(resources, xmlPullParser, attributeSet, theme);
        return c8189c;
    }

    /* renamed from: b */
    private void m16551b(String str, Animator animator) {
        animator.setTarget(this.f19659d.f19665b.m16518d(str));
        if (Build.VERSION.SDK_INT < 21) {
            m16550c(animator);
        }
        C8191b c8191b = this.f19659d;
        if (c8191b.f19667d == null) {
            c8191b.f19667d = new ArrayList<>();
            this.f19659d.f19668e = new C7521a<>();
        }
        this.f19659d.f19667d.add(animator);
        this.f19659d.f19668e.put(animator, str);
    }

    /* renamed from: c */
    private void m16550c(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                m16550c(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f19661f == null) {
                    this.f19661f = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f19661f);
            }
        }
    }

    @Override // p201g.p267w.p268a.p269a.AbstractC8198h, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            C1365a.m36201a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            return C1365a.m36200b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f19659d.f19665b.draw(canvas);
        if (this.f19659d.f19666c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            return C1365a.m36198d(drawable);
        }
        return this.f19659d.f19665b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f19659d.f19664a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            return C1365a.m36197e(drawable);
        }
        return this.f19659d.f19665b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f19674c == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C8192c(this.f19674c.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f19659d.f19665b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f19659d.f19665b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f19659d.f19665b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            C1365a.m36195g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray m36221k = C1364g.m36221k(resources, theme, attributeSet, C8187a.f19651e);
                    int resourceId = m36221k.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C8199i m16520b = C8199i.m16520b(resources, resourceId, theme);
                        m16520b.m16514h(false);
                        m16520b.setCallback(this.f19662w);
                        C8199i c8199i = this.f19659d.f19665b;
                        if (c8199i != null) {
                            c8199i.setCallback(null);
                        }
                        this.f19659d.f19665b = m16520b;
                    }
                    m36221k.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C8187a.f19652f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f19660e;
                        if (context != null) {
                            m16551b(string, C8194e.m16538i(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f19659d.m16549a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            return C1365a.m36194h(drawable);
        }
        return this.f19659d.f19665b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f19659d.f19666c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f19659d.f19665b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f19659d.f19665b.setBounds(rect);
        }
    }

    @Override // p201g.p267w.p268a.p269a.AbstractC8198h, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return this.f19659d.f19665b.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f19659d.f19665b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f19659d.f19665b.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            C1365a.m36192j(drawable, z);
        } else {
            this.f19659d.f19665b.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC1366b
    public void setTint(int i) {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            C1365a.m36188n(drawable, i);
        } else {
            this.f19659d.f19665b.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC1366b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            C1365a.m36187o(drawable, colorStateList);
        } else {
            this.f19659d.f19665b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC1366b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            C1365a.m36186p(drawable, mode);
        } else {
            this.f19659d.f19665b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f19659d.f19665b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (this.f19659d.f19666c.isStarted()) {
        } else {
            this.f19659d.f19666c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f19659d.f19666c.end();
        }
    }

    private C8189c(Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f19674c;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f19659d.f19665b.setColorFilter(colorFilter);
        }
    }

    /* compiled from: AnimatedVectorDrawableCompat.java */
    /* renamed from: g.w.a.a.c$c */
    /* loaded from: classes2.dex */
    private static class C8192c extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f19669a;

        public C8192c(Drawable.ConstantState constantState) {
            this.f19669a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f19669a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f19669a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C8189c c8189c = new C8189c();
            Drawable newDrawable = this.f19669a.newDrawable();
            c8189c.f19674c = newDrawable;
            newDrawable.setCallback(c8189c.f19662w);
            return c8189c;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C8189c c8189c = new C8189c();
            Drawable newDrawable = this.f19669a.newDrawable(resources);
            c8189c.f19674c = newDrawable;
            newDrawable.setCallback(c8189c.f19662w);
            return c8189c;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C8189c c8189c = new C8189c();
            Drawable newDrawable = this.f19669a.newDrawable(resources, theme);
            c8189c.f19674c = newDrawable;
            newDrawable.setCallback(c8189c.f19662w);
            return c8189c;
        }
    }

    private C8189c(Context context, C8191b c8191b, Resources resources) {
        this.f19661f = null;
        this.f19662w = new C8190a();
        this.f19660e = context;
        if (c8191b != null) {
            this.f19659d = c8191b;
        } else {
            this.f19659d = new C8191b(context, c8191b, this.f19662w, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
