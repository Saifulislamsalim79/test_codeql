package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import p201g.p227h.p238l.ViewTreeObserver$OnPreDrawListenerC7755t;
import p201g.p248l.C7801a;
import p201g.p248l.C7802b;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentAnim.java */
/* renamed from: androidx.fragment.app.j */
/* loaded from: classes2.dex */
public class C1495j {
    /* renamed from: a */
    private static int m35714a(Fragment fragment, boolean z, boolean z2) {
        if (z2) {
            if (z) {
                return fragment.getPopEnterAnim();
            }
            return fragment.getPopExitAnim();
        } else if (z) {
            return fragment.getEnterAnim();
        } else {
            return fragment.getExitAnim();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C1496a m35713b(Context context, Fragment fragment, boolean z, boolean z2) {
        int nextTransition = fragment.getNextTransition();
        int m35714a = m35714a(fragment, z, z2);
        boolean z3 = false;
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && viewGroup.getTag(C7802b.visible_removing_fragment_view_tag) != null) {
            fragment.mContainer.setTag(C7802b.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z, m35714a);
            if (onCreateAnimation != null) {
                return new C1496a(onCreateAnimation);
            }
            Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z, m35714a);
            if (onCreateAnimator != null) {
                return new C1496a(onCreateAnimator);
            }
            if (m35714a == 0 && nextTransition != 0) {
                m35714a = m35711d(context, nextTransition, z);
            }
            if (m35714a != 0) {
                boolean equals = "anim".equals(context.getResources().getResourceTypeName(m35714a));
                if (equals) {
                    try {
                        Animation loadAnimation = AnimationUtils.loadAnimation(context, m35714a);
                        if (loadAnimation != null) {
                            return new C1496a(loadAnimation);
                        }
                        z3 = true;
                    } catch (Resources.NotFoundException e) {
                        throw e;
                    } catch (RuntimeException unused) {
                    }
                }
                if (!z3) {
                    try {
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, m35714a);
                        if (loadAnimator != null) {
                            return new C1496a(loadAnimator);
                        }
                    } catch (RuntimeException e2) {
                        if (!equals) {
                            Animation loadAnimation2 = AnimationUtils.loadAnimation(context, m35714a);
                            if (loadAnimation2 != null) {
                                return new C1496a(loadAnimation2);
                            }
                        } else {
                            throw e2;
                        }
                    }
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: c */
    private static int m35712c(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: d */
    private static int m35711d(Context context, int i, boolean z) {
        if (i == 4097) {
            return z ? C7801a.fragment_open_enter : C7801a.fragment_open_exit;
        } else if (i == 8194) {
            return z ? C7801a.fragment_close_enter : C7801a.fragment_close_exit;
        } else if (i == 8197) {
            if (z) {
                return m35712c(context, 16842938);
            }
            return m35712c(context, 16842939);
        } else if (i == 4099) {
            return z ? C7801a.fragment_fade_enter : C7801a.fragment_fade_exit;
        } else if (i != 4100) {
            return -1;
        } else {
            if (z) {
                return m35712c(context, 16842936);
            }
            return m35712c(context, 16842937);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentAnim.java */
    /* renamed from: androidx.fragment.app.j$a */
    /* loaded from: classes2.dex */
    public static class C1496a {

        /* renamed from: a */
        public final Animation f4608a;

        /* renamed from: b */
        public final Animator f4609b;

        C1496a(Animation animation) {
            this.f4608a = animation;
            this.f4609b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        C1496a(Animator animator) {
            this.f4608a = null;
            this.f4609b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentAnim.java */
    /* renamed from: androidx.fragment.app.j$b */
    /* loaded from: classes2.dex */
    public static class RunnableC1497b extends AnimationSet implements Runnable {

        /* renamed from: c */
        private final ViewGroup f4610c;

        /* renamed from: d */
        private final View f4611d;

        /* renamed from: e */
        private boolean f4612e;

        /* renamed from: f */
        private boolean f4613f;

        /* renamed from: w */
        private boolean f4614w;

        /* JADX INFO: Access modifiers changed from: package-private */
        public RunnableC1497b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f4614w = true;
            this.f4610c = viewGroup;
            this.f4611d = view;
            addAnimation(animation);
            this.f4610c.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation) {
            this.f4614w = true;
            if (this.f4612e) {
                return !this.f4613f;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f4612e = true;
                ViewTreeObserver$OnPreDrawListenerC7755t.m17571a(this.f4610c, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f4612e && this.f4614w) {
                this.f4614w = false;
                this.f4610c.post(this);
                return;
            }
            this.f4610c.endViewTransition(this.f4611d);
            this.f4613f = true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f4614w = true;
            if (this.f4612e) {
                return !this.f4613f;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f4612e = true;
                ViewTreeObserver$OnPreDrawListenerC7755t.m17571a(this.f4610c, this);
            }
            return true;
        }
    }
}
