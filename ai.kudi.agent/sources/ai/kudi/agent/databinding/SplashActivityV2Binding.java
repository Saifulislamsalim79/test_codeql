package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
import pl.droidsonroids.gif.GifImageView;
/* loaded from: classes.dex */
public final class SplashActivityV2Binding implements InterfaceC8209a {
    public final GifImageView lottieAnimationView;
    private final ConstraintLayout rootView;

    private SplashActivityV2Binding(ConstraintLayout constraintLayout, GifImageView gifImageView) {
        this.rootView = constraintLayout;
        this.lottieAnimationView = gifImageView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SplashActivityV2Binding bind(View view) {
        View $r1 = view.findViewById(C0001R.C0003id.lottieAnimationView);
        GifImageView $r2 = (GifImageView) $r1;
        if ($r2 != null) {
            ConstraintLayout $r4 = (ConstraintLayout) view;
            SplashActivityV2Binding $r3 = new SplashActivityV2Binding($r4, $r2);
            return $r3;
        }
        Resources $r5 = view.getResources();
        String $r6 = $r5.getResourceName(C0001R.C0003id.lottieAnimationView);
        NullPointerException $r7 = new NullPointerException("Missing required view with ID: ".concat($r6));
        throw $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SplashActivityV2Binding inflate(LayoutInflater layoutInflater) {
        SplashActivityV2Binding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SplashActivityV2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.splash_activity_v2, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        SplashActivityV2Binding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        View $r1 = getRoot();
        View r2 = $r1;
        return r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public ConstraintLayout getRoot() {
        ConstraintLayout r1 = this.rootView;
        return r1;
    }
}
