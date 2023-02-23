package ai.kudi.agent.collections.databinding;

import ai.kudi.agent.collections.R$id;
import ai.kudi.agent.collections.R$layout;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ActivityMarketPlaceBinding implements InterfaceC8209a {
    public final FrameLayout flMarketPlaceContainer;
    public final Toolbar marketplaceToolbar;
    public final TextView marketplaceToolbarText;
    private final LinearLayout rootView;
    public final AppCompatTextView tvNeedHelpButton;

    private ActivityMarketPlaceBinding(LinearLayout linearLayout, FrameLayout frameLayout, Toolbar toolbar, TextView textView, AppCompatTextView appCompatTextView) {
        this.rootView = linearLayout;
        this.flMarketPlaceContainer = frameLayout;
        this.marketplaceToolbar = toolbar;
        this.marketplaceToolbarText = textView;
        this.tvNeedHelpButton = appCompatTextView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityMarketPlaceBinding bind(View view) {
        int $i0 = R$id.fl_market_place_container;
        View $r1 = view.findViewById($i0);
        FrameLayout $r2 = (FrameLayout) $r1;
        if ($r2 != null) {
            $i0 = R$id.marketplace_toolbar;
            View $r12 = view.findViewById($i0);
            Toolbar $r3 = (Toolbar) $r12;
            if ($r3 != null) {
                $i0 = R$id.marketplace_toolbar_text;
                View $r13 = view.findViewById($i0);
                TextView $r4 = (TextView) $r13;
                if ($r4 != null) {
                    $i0 = R$id.tv_need_help_button;
                    View $r14 = view.findViewById($i0);
                    AppCompatTextView $r5 = (AppCompatTextView) $r14;
                    if ($r5 != null) {
                        ActivityMarketPlaceBinding $r6 = new ActivityMarketPlaceBinding((LinearLayout) view, $r2, $r3, $r4, $r5);
                        return $r6;
                    }
                }
            }
        }
        Resources $r8 = view.getResources();
        String $r9 = $r8.getResourceName($i0);
        NullPointerException $r10 = new NullPointerException("Missing required view with ID: ".concat($r9));
        throw $r10;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityMarketPlaceBinding inflate(LayoutInflater layoutInflater) {
        ActivityMarketPlaceBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityMarketPlaceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = R$layout.activity_market_place;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ActivityMarketPlaceBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        LinearLayout $r1 = getRoot();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public LinearLayout getRoot() {
        LinearLayout r1 = this.rootView;
        return r1;
    }
}
