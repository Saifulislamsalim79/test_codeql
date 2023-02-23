package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.AppBarLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentBvnUpdateBinding implements InterfaceC8209a {
    public final AppBarLayout appBar;
    public final ImageView backIcon;
    public final KudiInputField bvnInputField;
    public final TextView learnMore;
    private final ConstraintLayout rootView;
    public final ScrollView scrollView;
    public final TextView title;
    public final Toolbar toolbar;
    public final TextView toolbarTitle;
    public final KudiButton verifyButton;

    private FragmentBvnUpdateBinding(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, ImageView imageView, KudiInputField kudiInputField, TextView textView, ScrollView scrollView, TextView textView2, Toolbar toolbar, TextView textView3, KudiButton kudiButton) {
        this.rootView = constraintLayout;
        this.appBar = appBarLayout;
        this.backIcon = imageView;
        this.bvnInputField = kudiInputField;
        this.learnMore = textView;
        this.scrollView = scrollView;
        this.title = textView2;
        this.toolbar = toolbar;
        this.toolbarTitle = textView3;
        this.verifyButton = kudiButton;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentBvnUpdateBinding bind(View view) {
        int $i0 = C0001R.C0003id.app_bar;
        View $r1 = view.findViewById(C0001R.C0003id.app_bar);
        AppBarLayout $r2 = (AppBarLayout) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.back_icon;
            View $r12 = view.findViewById(C0001R.C0003id.back_icon);
            ImageView imageView = (ImageView) $r12;
            if (imageView != null) {
                $i0 = C0001R.C0003id.bvnInputField;
                View $r13 = view.findViewById(C0001R.C0003id.bvnInputField);
                KudiInputField kudiInputField = (KudiInputField) $r13;
                if (kudiInputField != null) {
                    $i0 = C0001R.C0003id.learnMore;
                    View $r14 = view.findViewById(C0001R.C0003id.learnMore);
                    TextView textView = (TextView) $r14;
                    if (textView != null) {
                        $i0 = C0001R.C0003id.scroll_view;
                        View $r15 = view.findViewById(C0001R.C0003id.scroll_view);
                        ScrollView scrollView = (ScrollView) $r15;
                        if (scrollView != null) {
                            $i0 = C0001R.C0003id.title;
                            View $r16 = view.findViewById(C0001R.C0003id.title);
                            TextView textView2 = (TextView) $r16;
                            if (textView2 != null) {
                                $i0 = C0001R.C0003id.toolbar;
                                View $r17 = view.findViewById(C0001R.C0003id.toolbar);
                                Toolbar $r8 = (Toolbar) $r17;
                                if ($r8 != null) {
                                    $i0 = C0001R.C0003id.toolbar_title;
                                    View $r18 = view.findViewById(C0001R.C0003id.toolbar_title);
                                    TextView $r9 = (TextView) $r18;
                                    if ($r9 != null) {
                                        $i0 = C0001R.C0003id.verifyButton;
                                        View $r19 = view.findViewById(C0001R.C0003id.verifyButton);
                                        KudiButton $r10 = (KudiButton) $r19;
                                        if ($r10 != null) {
                                            ConstraintLayout $r122 = (ConstraintLayout) view;
                                            FragmentBvnUpdateBinding $r11 = new FragmentBvnUpdateBinding($r122, $r2, imageView, kudiInputField, textView, scrollView, textView2, $r8, $r9, $r10);
                                            return $r11;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Resources $r132 = view.getResources();
        String $r142 = $r132.getResourceName($i0);
        NullPointerException $r152 = new NullPointerException("Missing required view with ID: ".concat($r142));
        throw $r152;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentBvnUpdateBinding inflate(LayoutInflater layoutInflater) {
        FragmentBvnUpdateBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentBvnUpdateBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_bvn_update, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentBvnUpdateBinding $r3 = bind($r2);
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
