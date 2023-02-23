package ai.kudi.agent.feature_kshock.databinding;

import ai.kudi.agent.feature_kshock.C0220R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.appbar.AppBarLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class KshockToolBarBinding implements InterfaceC8209a {
    public final AppCompatImageView backButton;
    private final AppBarLayout rootView;
    public final TextView screenTitleText;

    private KshockToolBarBinding(AppBarLayout appBarLayout, AppCompatImageView appCompatImageView, TextView textView) {
        this.rootView = appBarLayout;
        this.backButton = appCompatImageView;
        this.screenTitleText = textView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static KshockToolBarBinding bind(View view) {
        int $i0 = C0220R.C0222id.back_button;
        View $r1 = view.findViewById($i0);
        AppCompatImageView $r2 = (AppCompatImageView) $r1;
        if ($r2 != null) {
            $i0 = C0220R.C0222id.screen_title_text;
            View $r12 = view.findViewById($i0);
            TextView $r3 = (TextView) $r12;
            if ($r3 != null) {
                AppBarLayout $r5 = (AppBarLayout) view;
                KshockToolBarBinding $r4 = new KshockToolBarBinding($r5, $r2, $r3);
                return $r4;
            }
        }
        Resources $r6 = view.getResources();
        String $r7 = $r6.getResourceName($i0);
        NullPointerException $r8 = new NullPointerException("Missing required view with ID: ".concat($r7));
        throw $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static KshockToolBarBinding inflate(LayoutInflater layoutInflater) {
        KshockToolBarBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static KshockToolBarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0220R.C0223layout.kshock_tool_bar;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        KshockToolBarBinding $r3 = bind($r2);
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
    public AppBarLayout getRoot() {
        AppBarLayout r1 = this.rootView;
        return r1;
    }
}
