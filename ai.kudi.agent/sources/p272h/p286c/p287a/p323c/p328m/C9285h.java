package p272h.p286c.p287a.p323c.p328m;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p201g.p218e.C7534g;
/* compiled from: MotionSpec.java */
/* renamed from: h.c.a.c.m.h */
/* loaded from: classes2.dex */
public class C9285h {

    /* renamed from: a */
    private final C7534g<String, C9286i> f21819a = new C7534g<>();

    /* renamed from: b */
    private final C7534g<String, PropertyValuesHolder[]> f21820b = new C7534g<>();

    /* renamed from: a */
    private static void m15225a(C9285h c9285h, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c9285h.m15218h(objectAnimator.getPropertyName(), objectAnimator.getValues());
            c9285h.m15217i(objectAnimator.getPropertyName(), C9286i.m15215b(objectAnimator));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
    }

    /* renamed from: b */
    public static C9285h m15224b(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return m15223c(context, resourceId);
    }

    /* renamed from: c */
    public static C9285h m15223c(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return m15222d(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(loadAnimator);
                return m15222d(arrayList);
            }
            return null;
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    /* renamed from: d */
    private static C9285h m15222d(List<Animator> list) {
        C9285h c9285h = new C9285h();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m15225a(c9285h, list.get(i));
        }
        return c9285h;
    }

    /* renamed from: e */
    public C9286i m15221e(String str) {
        if (m15219g(str)) {
            return this.f21819a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9285h) {
            return this.f21819a.equals(((C9285h) obj).f21819a);
        }
        return false;
    }

    /* renamed from: f */
    public long m15220f() {
        int size = this.f21819a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C9286i m18448o = this.f21819a.m18448o(i);
            j = Math.max(j, m18448o.m15214c() + m18448o.m15213d());
        }
        return j;
    }

    /* renamed from: g */
    public boolean m15219g(String str) {
        return this.f21819a.get(str) != null;
    }

    /* renamed from: h */
    public void m15218h(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f21820b.put(str, propertyValuesHolderArr);
    }

    public int hashCode() {
        return this.f21819a.hashCode();
    }

    /* renamed from: i */
    public void m15217i(String str, C9286i c9286i) {
        this.f21819a.put(str, c9286i);
    }

    public String toString() {
        return '\n' + C9285h.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f21819a + "}\n";
    }
}
