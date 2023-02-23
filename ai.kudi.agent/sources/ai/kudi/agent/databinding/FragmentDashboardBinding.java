package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentDashboardBinding implements InterfaceC8209a {
    public final TextView appVersion;
    public final TextView dateTextView;
    public final Button fundWalletButton;
    public final LinearLayout fundWalletLayout;
    public final LinearLayout layoutOne;
    public final LinearLayout layoutZero;
    public final LinearLayout needHelpLayout;
    public final ProgressBar progressBar;
    public final RelativeLayout relativeLayout2;
    private final ScrollView rootView;
    public final Button talkToUsButton;
    public final TextView totalAmountProcessedTextView;
    public final TextView totalCountProcessedTextView;
    public final LinearLayout updateAppLayout;
    public final Button updateButton;
    public final TextView viewBreakdown;
    public final TextView walletInfo;

    private FragmentDashboardBinding(ScrollView scrollView, TextView textView, TextView textView2, Button button, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, ProgressBar progressBar, RelativeLayout relativeLayout, Button button2, TextView textView3, TextView textView4, LinearLayout linearLayout5, Button button3, TextView textView5, TextView textView6) {
        this.rootView = scrollView;
        this.appVersion = textView;
        this.dateTextView = textView2;
        this.fundWalletButton = button;
        this.fundWalletLayout = linearLayout;
        this.layoutOne = linearLayout2;
        this.layoutZero = linearLayout3;
        this.needHelpLayout = linearLayout4;
        this.progressBar = progressBar;
        this.relativeLayout2 = relativeLayout;
        this.talkToUsButton = button2;
        this.totalAmountProcessedTextView = textView3;
        this.totalCountProcessedTextView = textView4;
        this.updateAppLayout = linearLayout5;
        this.updateButton = button3;
        this.viewBreakdown = textView5;
        this.walletInfo = textView6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static FragmentDashboardBinding bind(View view) {
        int $i0 = C0001R.C0003id.appVersion;
        View $r1 = view.findViewById(C0001R.C0003id.appVersion);
        TextView textView = (TextView) $r1;
        if (textView != null) {
            $i0 = C0001R.C0003id.dateTextView;
            View $r12 = view.findViewById(C0001R.C0003id.dateTextView);
            TextView textView2 = (TextView) $r12;
            if (textView2 != null) {
                $i0 = C0001R.C0003id.fundWalletButton;
                View $r13 = view.findViewById(C0001R.C0003id.fundWalletButton);
                Button button = (Button) $r13;
                if (button != null) {
                    $i0 = C0001R.C0003id.fundWalletLayout;
                    View $r14 = view.findViewById(C0001R.C0003id.fundWalletLayout);
                    LinearLayout linearLayout = (LinearLayout) $r14;
                    if (linearLayout != null) {
                        $i0 = C0001R.C0003id.layoutOne;
                        View $r15 = view.findViewById(C0001R.C0003id.layoutOne);
                        LinearLayout linearLayout2 = (LinearLayout) $r15;
                        if (linearLayout2 != null) {
                            $i0 = C0001R.C0003id.layoutZero;
                            View $r16 = view.findViewById(C0001R.C0003id.layoutZero);
                            LinearLayout linearLayout3 = (LinearLayout) $r16;
                            if (linearLayout3 != null) {
                                $i0 = C0001R.C0003id.needHelpLayout;
                                View $r17 = view.findViewById(C0001R.C0003id.needHelpLayout);
                                LinearLayout $r8 = (LinearLayout) $r17;
                                if ($r8 != null) {
                                    $i0 = C0001R.C0003id.progress_bar;
                                    View $r18 = view.findViewById(C0001R.C0003id.progress_bar);
                                    ProgressBar $r9 = (ProgressBar) $r18;
                                    if ($r9 != null) {
                                        $i0 = C0001R.C0003id.relativeLayout2;
                                        View $r19 = view.findViewById(C0001R.C0003id.relativeLayout2);
                                        RelativeLayout $r10 = (RelativeLayout) $r19;
                                        if ($r10 != null) {
                                            $i0 = C0001R.C0003id.talkToUsButton;
                                            View $r110 = view.findViewById(C0001R.C0003id.talkToUsButton);
                                            Button $r11 = (Button) $r110;
                                            if ($r11 != null) {
                                                $i0 = C0001R.C0003id.totalAmountProcessedTextView;
                                                View $r111 = view.findViewById(C0001R.C0003id.totalAmountProcessedTextView);
                                                TextView $r122 = (TextView) $r111;
                                                if ($r122 != null) {
                                                    $i0 = C0001R.C0003id.totalCountProcessedTextView;
                                                    View $r112 = view.findViewById(C0001R.C0003id.totalCountProcessedTextView);
                                                    TextView $r132 = (TextView) $r112;
                                                    if ($r132 != null) {
                                                        $i0 = C0001R.C0003id.updateAppLayout;
                                                        View $r113 = view.findViewById(C0001R.C0003id.updateAppLayout);
                                                        LinearLayout $r142 = (LinearLayout) $r113;
                                                        if ($r142 != null) {
                                                            $i0 = C0001R.C0003id.updateButton;
                                                            View $r114 = view.findViewById(C0001R.C0003id.updateButton);
                                                            Button $r152 = (Button) $r114;
                                                            if ($r152 != null) {
                                                                $i0 = C0001R.C0003id.view_breakdown;
                                                                View $r115 = view.findViewById(C0001R.C0003id.view_breakdown);
                                                                TextView $r162 = (TextView) $r115;
                                                                if ($r162 != null) {
                                                                    $i0 = C0001R.C0003id.walletInfo;
                                                                    View $r116 = view.findViewById(C0001R.C0003id.walletInfo);
                                                                    TextView $r172 = (TextView) $r116;
                                                                    if ($r172 != null) {
                                                                        ScrollView $r192 = (ScrollView) view;
                                                                        FragmentDashboardBinding $r182 = new FragmentDashboardBinding($r192, textView, textView2, button, linearLayout, linearLayout2, linearLayout3, $r8, $r9, $r10, $r11, $r122, $r132, $r142, $r152, $r162, $r172);
                                                                        return $r182;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Resources $r20 = view.getResources();
        String $r21 = $r20.getResourceName($i0);
        NullPointerException $r22 = new NullPointerException("Missing required view with ID: ".concat($r21));
        throw $r22;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static FragmentDashboardBinding inflate(LayoutInflater layoutInflater) {
        FragmentDashboardBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static FragmentDashboardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_dashboard, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentDashboardBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        ScrollView $r1 = getRoot();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // p201g.p270x.InterfaceC8209a
    public ScrollView getRoot() {
        ScrollView r1 = this.rootView;
        return r1;
    }
}
