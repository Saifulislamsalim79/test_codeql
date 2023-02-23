package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiTextView;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentAccountAndSettingsOptionsBinding implements InterfaceC8209a {
    public final TextView accountTypeView;
    public final KudiTextView appInfoText;
    public final ConstraintLayout constraintLayout7;
    private final NestedScrollView rootView;
    public final RecyclerView settingsOptionsRv;
    public final TextView switchAccountButton;
    public final TextView textView34;
    public final View view25;

    private FragmentAccountAndSettingsOptionsBinding(NestedScrollView nestedScrollView, TextView textView, KudiTextView kudiTextView, ConstraintLayout constraintLayout, RecyclerView recyclerView, TextView textView2, TextView textView3, View view) {
        this.rootView = nestedScrollView;
        this.accountTypeView = textView;
        this.appInfoText = kudiTextView;
        this.constraintLayout7 = constraintLayout;
        this.settingsOptionsRv = recyclerView;
        this.switchAccountButton = textView2;
        this.textView34 = textView3;
        this.view25 = view;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentAccountAndSettingsOptionsBinding bind(View view) {
        int $i0 = C0001R.C0003id.accountTypeView;
        View $r1 = view.findViewById(C0001R.C0003id.accountTypeView);
        TextView $r2 = (TextView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.app_info_text;
            View $r12 = view.findViewById(C0001R.C0003id.app_info_text);
            KudiTextView $r3 = (KudiTextView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.constraintLayout7;
                View $r13 = view.findViewById(C0001R.C0003id.constraintLayout7);
                ConstraintLayout constraintLayout = (ConstraintLayout) $r13;
                if (constraintLayout != null) {
                    $i0 = C0001R.C0003id.settings_options_rv;
                    View $r14 = view.findViewById(C0001R.C0003id.settings_options_rv);
                    RecyclerView recyclerView = (RecyclerView) $r14;
                    if (recyclerView != null) {
                        $i0 = C0001R.C0003id.switchAccountButton;
                        View $r15 = view.findViewById(C0001R.C0003id.switchAccountButton);
                        TextView textView = (TextView) $r15;
                        if (textView != null) {
                            $i0 = C0001R.C0003id.textView34;
                            View $r16 = view.findViewById(C0001R.C0003id.textView34);
                            TextView textView2 = (TextView) $r16;
                            if (textView2 != null) {
                                $i0 = C0001R.C0003id.view25;
                                View $r17 = view.findViewById(C0001R.C0003id.view25);
                                if ($r17 != null) {
                                    NestedScrollView $r9 = (NestedScrollView) view;
                                    FragmentAccountAndSettingsOptionsBinding $r8 = new FragmentAccountAndSettingsOptionsBinding($r9, $r2, $r3, constraintLayout, recyclerView, textView, textView2, $r17);
                                    return $r8;
                                }
                            }
                        }
                    }
                }
            }
        }
        Resources $r10 = view.getResources();
        String $r11 = $r10.getResourceName($i0);
        NullPointerException $r122 = new NullPointerException("Missing required view with ID: ".concat($r11));
        throw $r122;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentAccountAndSettingsOptionsBinding inflate(LayoutInflater layoutInflater) {
        FragmentAccountAndSettingsOptionsBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentAccountAndSettingsOptionsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_account_and_settings_options, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentAccountAndSettingsOptionsBinding $r3 = bind($r2);
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
    public NestedScrollView getRoot() {
        NestedScrollView r1 = this.rootView;
        return r1;
    }
}
