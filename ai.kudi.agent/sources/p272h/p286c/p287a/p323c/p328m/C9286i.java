package p272h.p286c.p287a.p323c.p328m;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
/* compiled from: MotionTiming.java */
/* renamed from: h.c.a.c.m.i */
/* loaded from: classes2.dex */
public class C9286i {

    /* renamed from: a */
    private long f21821a;

    /* renamed from: b */
    private long f21822b;

    /* renamed from: c */
    private TimeInterpolator f21823c;

    /* renamed from: d */
    private int f21824d;

    /* renamed from: e */
    private int f21825e;

    public C9286i(long j, long j2) {
        this.f21821a = 0L;
        this.f21822b = 300L;
        this.f21823c = null;
        this.f21824d = 0;
        this.f21825e = 1;
        this.f21821a = j;
        this.f21822b = j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C9286i m15215b(ValueAnimator valueAnimator) {
        C9286i c9286i = new C9286i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), m15211f(valueAnimator));
        c9286i.f21824d = valueAnimator.getRepeatCount();
        c9286i.f21825e = valueAnimator.getRepeatMode();
        return c9286i;
    }

    /* renamed from: f */
    private static TimeInterpolator m15211f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if (!(interpolator instanceof AccelerateDecelerateInterpolator) && interpolator != null) {
            if (interpolator instanceof AccelerateInterpolator) {
                return C9278a.f21808c;
            }
            return interpolator instanceof DecelerateInterpolator ? C9278a.f21809d : interpolator;
        }
        return C9278a.f21807b;
    }

    /* renamed from: a */
    public void m15216a(Animator animator) {
        animator.setStartDelay(m15214c());
        animator.setDuration(m15213d());
        animator.setInterpolator(m15212e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(m15210g());
            valueAnimator.setRepeatMode(m15209h());
        }
    }

    /* renamed from: c */
    public long m15214c() {
        return this.f21821a;
    }

    /* renamed from: d */
    public long m15213d() {
        return this.f21822b;
    }

    /* renamed from: e */
    public TimeInterpolator m15212e() {
        TimeInterpolator timeInterpolator = this.f21823c;
        return timeInterpolator != null ? timeInterpolator : C9278a.f21807b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9286i) {
            C9286i c9286i = (C9286i) obj;
            if (m15214c() == c9286i.m15214c() && m15213d() == c9286i.m15213d() && m15210g() == c9286i.m15210g() && m15209h() == c9286i.m15209h()) {
                return m15212e().getClass().equals(c9286i.m15212e().getClass());
            }
            return false;
        }
        return false;
    }

    /* renamed from: g */
    public int m15210g() {
        return this.f21824d;
    }

    /* renamed from: h */
    public int m15209h() {
        return this.f21825e;
    }

    public int hashCode() {
        return (((((((((int) (m15214c() ^ (m15214c() >>> 32))) * 31) + ((int) (m15213d() ^ (m15213d() >>> 32)))) * 31) + m15212e().getClass().hashCode()) * 31) + m15210g()) * 31) + m15209h();
    }

    public String toString() {
        return '\n' + C9286i.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + m15214c() + " duration: " + m15213d() + " interpolator: " + m15212e().getClass() + " repeatCount: " + m15210g() + " repeatMode: " + m15209h() + "}\n";
    }

    public C9286i(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f21821a = 0L;
        this.f21822b = 300L;
        this.f21823c = null;
        this.f21824d = 0;
        this.f21825e = 1;
        this.f21821a = j;
        this.f21822b = j2;
        this.f21823c = timeInterpolator;
    }
}
