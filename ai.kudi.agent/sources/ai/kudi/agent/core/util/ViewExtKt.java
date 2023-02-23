package ai.kudi.agent.core.util;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.C1335a;
import androidx.recyclerview.widget.C1723k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.intercom.android.sdk.annotations.SeenState;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p272h.p275b.p280b.p281a.p282a.AbstractC8228a;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
/* compiled from: ViewExt.kt */
@Metadata(m10422d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001e\u0010\b\u001a\u00020\t*\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f\u001a\u001c\u0010\u000e\u001a\u00020\t*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\f2\b\b\u0003\u0010\u0011\u001a\u00020\f\u001a(\u0010\u0012\u001a\u00020\t*\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0017\u001a\n\u0010\u0018\u001a\u00020\t*\u00020\n\u001a\n\u0010\u0019\u001a\u00020\t*\u00020\n\u001aG\u0010\u001a\u001a\u00020\t*\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\"¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\t0!\u001a\n\u0010&\u001a\u00020'*\u00020\u001c\u001a\u0014\u0010(\u001a\u00020\t*\u00020\n2\b\b\u0002\u0010)\u001a\u00020*\u001a\n\u0010+\u001a\u00020**\u00020\n\u001a<\u0010,\u001a\u00020\t*\u00020-2\b\b\u0002\u0010.\u001a\u00020\f2\b\b\u0002\u0010/\u001a\u00020\f2\b\b\u0002\u00100\u001a\u00020\f2\b\b\u0002\u00101\u001a\u00020\f2\b\b\u0002\u00102\u001a\u00020\f\u001a2\u00103\u001a\u00020\t*\u00020-2\b\b\u0003\u00104\u001a\u00020\f2\b\b\u0003\u00105\u001a\u00020\f2\b\b\u0003\u00106\u001a\u00020\f2\b\b\u0003\u00107\u001a\u00020\f\u001a\n\u00108\u001a\u00020\t*\u00020\n\u001a\"\u00109\u001a\u00020\t*\u00020\u001c2\u0006\u0010:\u001a\u00020*2\u0006\u0010;\u001a\u00020\n2\u0006\u0010<\u001a\u00020=\u001a\u001c\u0010>\u001a\u00020?*\u00020?2\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0001\u0010@\u001a\u00020\f\u001a\u001c\u0010>\u001a\u00020\t*\u00020A2\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0001\u0010@\u001a\u00020\f\u001a\u001e\u0010B\u001a\u00020\t*\u00020-2\b\b\u0001\u0010@\u001a\u00020\f2\b\b\u0002\u0010C\u001a\u00020*\u001a\u0012\u0010D\u001a\u00020'*\u00020\u001c2\u0006\u0010E\u001a\u00020'\u001a\u0012\u0010F\u001a\u00020'*\u00020'2\u0006\u0010\u001b\u001a\u00020\u001c\u001a\u0012\u0010G\u001a\u00020\t*\u00020\n2\u0006\u00108\u001a\u00020*\",\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u00032\b\u0010\u0000\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006H"}, m10421d2 = {"disposable", "Lio/reactivex/disposables/Disposable;", "insert", "Lio/reactivex/disposables/CompositeDisposable;", "getInsert", "(Lio/reactivex/disposables/CompositeDisposable;)Lio/reactivex/disposables/Disposable;", "setInsert", "(Lio/reactivex/disposables/CompositeDisposable;Lio/reactivex/disposables/Disposable;)V", "addClickEffect", "", "Landroid/view/View;", "defaultBgColor", "", "effectColor", "addDividerItemDecoration", "Landroidx/recyclerview/widget/RecyclerView;", "orientation", "drawable", "createInfiniteScrollListener", "maxItemsPerRequest", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "action", "Lkotlin/Function0;", "disable", "enable", "extractAttributes", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "styleableAttrs", "", "Lkotlin/Function1;", "Landroid/content/res/TypedArray;", "Lkotlin/ParameterName;", "name", "typeArray", "getScreenWidth", "", SeenState.HIDE, "onlyInvisible", "", "isVisible", "setCompoundKudiDrawables", "Landroid/widget/TextView;", OpsMetricTracker.START, "end", "top", "bottom", "drawablePadding", "setDrawableResource", "drawableStartResId", "drawableTopResId", "drawableEndResId", "drawableBottomResId", "show", "showFullProgress", "visible", "view", "progressBar", "Landroid/widget/ProgressBar;", "tint", "Landroid/graphics/drawable/Drawable;", "color", "Landroid/widget/ImageView;", "tintTextView", "includeText", "toDp", "value", "toPx", "toggleVisibility", "core_release"}, k = 2, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ViewExtKt {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void addClickEffect(final View view, final int i, final int i2) {
        Log_OC.getArray(view, "<this>");
        view.setOnTouchListener(new View.OnTouchListener() { // from class: ai.kudi.agent.core.util.LayoutManager
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                View $r2 = view;
                int $i0 = i2;
                int $i1 = i;
                boolean $z0 = ViewExtKt.m39184addClickEffect$lambda0($r2, $i0, $i1, view2, motionEvent);
                return $z0;
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void addClickEffect$default(View view, int $i0, int $i1, int i, Object obj) {
        int $i3 = i & 1;
        if ($i3 != 0) {
            $i0 = 17170445;
        }
        int $i2 = i & 2;
        if ($i2 != 0) {
            $i1 = 17170432;
        }
        addClickEffect(view, $i0, $i1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: addClickEffect$lambda-0 */
    public static final boolean m39184addClickEffect$lambda0(View view, int i, int i2, View view2, MotionEvent motionEvent) {
        Log_OC.getArray(view, "$this_addClickEffect");
        int $i2 = motionEvent.getAction();
        if ($i2 == 0) {
            Context $r3 = view.getContext();
            Log_OC.append($r3);
            int $i0 = C1335a.m36324d($r3, i);
            view2.setBackgroundColor($i0);
            return false;
        }
        Context $r32 = view.getContext();
        Log_OC.append($r32);
        int $i02 = C1335a.m36324d($r32, i2);
        view2.setBackgroundColor($i02);
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void addDividerItemDecoration(RecyclerView recyclerView, int i, int i2) {
        Log_OC.getArray(recyclerView, "<this>");
        RecyclerView r5 = recyclerView;
        C1723k r4 = new C1723k(r5.getContext(), i);
        if (i2 != 0) {
            RecyclerView r52 = recyclerView;
            Context $r2 = r52.getContext();
            Log_OC.loadImage($r2, "context");
            Drawable $r3 = ContextExtKt.getKudiDrawable($r2, i2);
            Log_OC.append($r3);
            r4.m34703f($r3);
        }
        recyclerView.m35294h(r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void addDividerItemDecoration$default(RecyclerView recyclerView, int i, int $i1, int i2, Object obj) {
        int $i2 = i2 & 2;
        if ($i2 != 0) {
            $i1 = 0;
        }
        addDividerItemDecoration(recyclerView, i, $i1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void createInfiniteScrollListener(RecyclerView recyclerView, int i, LinearLayoutManager linearLayoutManager, InterfaceC11756a interfaceC11756a) {
        Log_OC.getArray(recyclerView, "<this>");
        Log_OC.getArray(linearLayoutManager, "layoutManager");
        Log_OC.getArray(interfaceC11756a, "action");
        recyclerView.m35282l(new AbstractC8228a(i, linearLayoutManager) { // from class: ai.kudi.agent.core.util.ViewExtKt$createInfiniteScrollListener$onScrollListener$1
            final /* synthetic */ LinearLayoutManager $layoutManager;
            final /* synthetic */ int $maxItemsPerRequest;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(i, linearLayoutManager);
                this.$maxItemsPerRequest = i;
                this.$layoutManager = linearLayoutManager;
            }

            @Override // p272h.p275b.p280b.p281a.p282a.AbstractC8228a
            protected boolean canLoadMoreItems() {
                return true;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p272h.p275b.p280b.p281a.p282a.AbstractC8228a
            public void onScrolledToEnd(int i2) {
                InterfaceC11756a $r1 = InterfaceC11756a.this;
                $r1.invoke();
            }
        });
    }

    public static final void disable(View view) {
        Log_OC.getArray(view, "<this>");
        view.setEnabled(false);
    }

    public static final void enable(View view) {
        Log_OC.getArray(view, "<this>");
        view.setEnabled(true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void extractAttributes(View view, Context context, AttributeSet attributeSet, int[] iArr, InterfaceC11767l interfaceC11767l) {
        Log_OC.getArray(view, "<this>");
        Log_OC.getArray(context, "context");
        Log_OC.getArray(iArr, "styleableAttrs");
        Log_OC.getArray(interfaceC11767l, "action");
        TypedArray $r3 = context.obtainStyledAttributes(attributeSet, iArr);
        Log_OC.loadImage($r3, "context.obtainStyledAttributes(attributeSet, styleableAttrs)");
        try {
            interfaceC11767l.invoke($r3);
        } finally {
            $r3.recycle();
        }
    }

    public static final FavoritesArrayAdapter getInsert(C11280b c11280b) {
        Log_OC.getArray(c11280b, "<this>");
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final float getScreenWidth(Context context) {
        Log_OC.getArray(context, "<this>");
        Resources $r1 = context.getResources();
        DisplayMetrics $r2 = $r1.getDisplayMetrics();
        Log_OC.loadImage($r2, "resources.displayMetrics");
        int $i0 = $r2.widthPixels;
        float $f0 = $i0;
        float $f1 = $r2.density;
        return $f0 / $f1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void hide(View view, boolean z) {
        Log_OC.getArray(view, "<this>");
        byte $b0 = z ? (byte) 4 : (byte) 8;
        view.setVisibility($b0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void hide$default(View view, boolean $z0, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            $z0 = false;
        }
        hide(view, $z0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final boolean isVisible(View view) {
        Log_OC.getArray(view, "<this>");
        int $i0 = view.getVisibility();
        return $i0 == 0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void setCompoundKudiDrawables(TextView textView, int i, int i2, int i3, int i4, int i5) {
        Log_OC.getArray(textView, "<this>");
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i3, i2, i4);
        if (i5 != 0) {
            Context $r1 = textView.getContext();
            Log_OC.loadImage($r1, "context");
            float $f0 = i5;
            int $i3 = (int) toDp($r1, $f0);
            textView.setCompoundDrawablePadding($i3);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void setCompoundKudiDrawables$default(TextView textView, int $i0, int $i1, int $i2, int $i3, int $i4, int i, Object obj) {
        int $i6 = i & 1;
        if ($i6 != 0) {
            $i0 = 0;
        }
        int $i62 = i & 2;
        if ($i62 != 0) {
            $i1 = 0;
        }
        int $i63 = i & 4;
        if ($i63 != 0) {
            $i2 = 0;
        }
        int $i64 = i & 8;
        if ($i64 != 0) {
            $i3 = 0;
        }
        int $i5 = i & 16;
        if ($i5 != 0) {
            $i4 = 0;
        }
        setCompoundKudiDrawables(textView, $i0, $i1, $i2, $i3, $i4);
    }

    public static final void setDrawableResource(TextView textView, int i, int i2, int i3, int i4) {
        Log_OC.getArray(textView, "<this>");
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void setDrawableResource$default(TextView textView, int $i0, int $i1, int $i2, int $i3, int i, Object obj) {
        int $i5 = i & 1;
        if ($i5 != 0) {
            $i0 = 0;
        }
        int $i52 = i & 2;
        if ($i52 != 0) {
            $i1 = 0;
        }
        int $i53 = i & 4;
        if ($i53 != 0) {
            $i2 = 0;
        }
        int $i4 = i & 8;
        if ($i4 != 0) {
            $i3 = 0;
        }
        setDrawableResource(textView, $i0, $i1, $i2, $i3);
    }

    public static final void setInsert(C11280b c11280b, FavoritesArrayAdapter favoritesArrayAdapter) {
        Log_OC.getArray(c11280b, "<this>");
        Log_OC.append(favoritesArrayAdapter);
        c11280b.b(favoritesArrayAdapter);
    }

    public static final void show(View view) {
        Log_OC.getArray(view, "<this>");
        view.setVisibility(0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void showFullProgress(Context context, final boolean z, final View view, ProgressBar progressBar) {
        Log_OC.getArray(context, "<this>");
        Log_OC.getArray(view, "view");
        Log_OC.getArray(progressBar, "progressBar");
        Resources $r3 = context.getResources();
        int $i0 = $r3.getInteger(17694720);
        view.setVisibility(z ? 0 : 4);
        ViewPropertyAnimator $r4 = progressBar.animate();
        long $l2 = $i0;
        ViewPropertyAnimator $r42 = $r4.setDuration($l2);
        float $f0 = z ? 1.0f : 0.0f;
        $r42.alpha($f0).setListener(new AnimatorListenerAdapter() { // from class: ai.kudi.agent.core.util.ViewExtKt$showFullProgress$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                Log_OC.getArray(animator, "animation");
                View $r2 = view;
                boolean $z0 = z;
                byte $b0 = $z0 ? (byte) 0 : (byte) 4;
                $r2.setVisibility($b0);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final Drawable tint(Drawable drawable, Context context, int i) {
        Log_OC.getArray(drawable, "<this>");
        Log_OC.getArray(context, "context");
        drawable.mutate();
        int $i0 = C1335a.m36324d(context, i);
        PorterDuff.Mode $r3 = PorterDuff.Mode.SRC_IN;
        PorterDuffColorFilter $r2 = new PorterDuffColorFilter($i0, $r3);
        drawable.setColorFilter($r2);
        return drawable;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void tint(ImageView imageView, Context context, int i) {
        Log_OC.getArray(imageView, "<this>");
        Log_OC.getArray(context, "context");
        int $i0 = C1335a.m36324d(context, i);
        PorterDuff.Mode $r3 = PorterDuff.Mode.SRC_IN;
        PorterDuffColorFilter $r2 = new PorterDuffColorFilter($i0, $r3);
        imageView.setColorFilter($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final void tintTextView(TextView textView, int i, boolean z) {
        Log_OC.getArray(textView, "<this>");
        if (z) {
            int $i1 = C1335a.m36324d(textView.getContext(), i);
            textView.setTextColor($i1);
        }
        Drawable[] $r3 = textView.getCompoundDrawables();
        Log_OC.loadImage($r3, "compoundDrawables");
        int $i2 = 0;
        int $i12 = $r3.length;
        while ($i2 < $i12) {
            Drawable $r1 = $r3[$i2];
            Log_OC.loadImage($r1, "compoundDrawables");
            $i2++;
            Context $r2 = textView.getContext();
            Log_OC.loadImage($r2, "context");
            tint($r1, $r2, i);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void tintTextView$default(TextView textView, int i, boolean $z0, int i2, Object obj) {
        int $i1 = i2 & 2;
        if ($i1 != 0) {
            $z0 = true;
        }
        tintTextView(textView, i, $z0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final float toDp(Context context, float f) {
        Log_OC.getArray(context, "<this>");
        Resources $r1 = context.getResources();
        DisplayMetrics $r2 = $r1.getDisplayMetrics();
        float $f0 = TypedValue.applyDimension(1, f, $r2);
        return $f0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final float toPx(float f, Context context) {
        Log_OC.getArray(context, "context");
        Resources $r1 = context.getResources();
        DisplayMetrics $r2 = $r1.getDisplayMetrics();
        int $i0 = $r2.densityDpi;
        float $f1 = $i0 / 160;
        float $f0 = f * $f1;
        return $f0;
    }

    public static final void toggleVisibility(View view, boolean z) {
        Log_OC.getArray(view, "<this>");
        if (z) {
            show(view);
        } else {
            hide$default(view, false, 1, null);
        }
    }
}
