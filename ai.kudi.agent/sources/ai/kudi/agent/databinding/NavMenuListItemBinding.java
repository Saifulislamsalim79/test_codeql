package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.custom.views.CustomBgTextview;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class NavMenuListItemBinding implements InterfaceC8209a {
    public final Guideline guideline;
    public final ImageView itemIcon;
    public final CustomBgTextview itemNewFeatureBadge;
    public final TextView itemTitle;
    private final ConstraintLayout rootView;

    private NavMenuListItemBinding(ConstraintLayout constraintLayout, Guideline guideline, ImageView imageView, CustomBgTextview customBgTextview, TextView textView) {
        this.rootView = constraintLayout;
        this.guideline = guideline;
        this.itemIcon = imageView;
        this.itemNewFeatureBadge = customBgTextview;
        this.itemTitle = textView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static NavMenuListItemBinding bind(View view) {
        int $i0 = C0001R.C0003id.guideline;
        View $r1 = view.findViewById(C0001R.C0003id.guideline);
        Guideline $r2 = (Guideline) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.item_icon;
            View $r12 = view.findViewById(C0001R.C0003id.item_icon);
            ImageView $r3 = (ImageView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.item_new_feature_badge;
                View $r13 = view.findViewById(C0001R.C0003id.item_new_feature_badge);
                CustomBgTextview $r4 = (CustomBgTextview) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.item_title;
                    View $r14 = view.findViewById(C0001R.C0003id.item_title);
                    TextView textView = (TextView) $r14;
                    if (textView != null) {
                        NavMenuListItemBinding $r6 = new NavMenuListItemBinding((ConstraintLayout) view, $r2, $r3, $r4, textView);
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
    public static NavMenuListItemBinding inflate(LayoutInflater layoutInflater) {
        NavMenuListItemBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static NavMenuListItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.nav_menu_list_item, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        NavMenuListItemBinding $r3 = bind($r2);
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
