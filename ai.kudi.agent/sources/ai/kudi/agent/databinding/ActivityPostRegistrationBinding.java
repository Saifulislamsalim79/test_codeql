package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ActivityPostRegistrationBinding implements InterfaceC8209a {
    public final AppBarLayout appBarLayout;
    public final FrameLayout contentFrameLayout;
    public final KudiButton postRegActionButton;
    public final TextView postRegSkipButton;
    public final TextView postRegSubtitleView;
    public final TextView postRegTitleView;
    public final Toolbar postRegToolBar;
    private final ScrollView rootView;

    private ActivityPostRegistrationBinding(ScrollView scrollView, AppBarLayout appBarLayout, FrameLayout frameLayout, KudiButton kudiButton, TextView textView, TextView textView2, TextView textView3, Toolbar toolbar) {
        this.rootView = scrollView;
        this.appBarLayout = appBarLayout;
        this.contentFrameLayout = frameLayout;
        this.postRegActionButton = kudiButton;
        this.postRegSkipButton = textView;
        this.postRegSubtitleView = textView2;
        this.postRegTitleView = textView3;
        this.postRegToolBar = toolbar;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityPostRegistrationBinding bind(View view) {
        int $i0 = C0001R.C0003id.app_bar_layout;
        View $r1 = view.findViewById(C0001R.C0003id.app_bar_layout);
        AppBarLayout $r2 = (AppBarLayout) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.contentFrameLayout;
            View $r12 = view.findViewById(C0001R.C0003id.contentFrameLayout);
            FrameLayout $r3 = (FrameLayout) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.postRegActionButton;
                View $r13 = view.findViewById(C0001R.C0003id.postRegActionButton);
                KudiButton kudiButton = (KudiButton) $r13;
                if (kudiButton != null) {
                    $i0 = C0001R.C0003id.postRegSkipButton;
                    View $r14 = view.findViewById(C0001R.C0003id.postRegSkipButton);
                    TextView textView = (TextView) $r14;
                    if (textView != null) {
                        $i0 = C0001R.C0003id.postRegSubtitleView;
                        View $r15 = view.findViewById(C0001R.C0003id.postRegSubtitleView);
                        TextView textView2 = (TextView) $r15;
                        if (textView2 != null) {
                            $i0 = C0001R.C0003id.postRegTitleView;
                            View $r16 = view.findViewById(C0001R.C0003id.postRegTitleView);
                            TextView textView3 = (TextView) $r16;
                            if (textView3 != null) {
                                $i0 = C0001R.C0003id.postRegToolBar;
                                View $r17 = view.findViewById(C0001R.C0003id.postRegToolBar);
                                Toolbar $r8 = (Toolbar) $r17;
                                if ($r8 != null) {
                                    ScrollView $r10 = (ScrollView) view;
                                    ActivityPostRegistrationBinding $r9 = new ActivityPostRegistrationBinding($r10, $r2, $r3, kudiButton, textView, textView2, textView3, $r8);
                                    return $r9;
                                }
                            }
                        }
                    }
                }
            }
        }
        Resources $r11 = view.getResources();
        String $r122 = $r11.getResourceName($i0);
        NullPointerException $r132 = new NullPointerException("Missing required view with ID: ".concat($r122));
        throw $r132;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityPostRegistrationBinding inflate(LayoutInflater layoutInflater) {
        ActivityPostRegistrationBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityPostRegistrationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.activity_post_registration, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ActivityPostRegistrationBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        ScrollView $r1 = getRoot();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public ScrollView getRoot() {
        ScrollView r1 = this.rootView;
        return r1;
    }
}
