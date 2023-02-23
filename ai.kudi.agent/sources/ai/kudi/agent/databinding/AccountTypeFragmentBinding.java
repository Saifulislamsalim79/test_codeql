package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class AccountTypeFragmentBinding implements InterfaceC8209a {
    public final ImageView agentCheckIcon;
    public final TextView agentRadioButton;
    public final KudiButton continueToNextPage;
    public final TextView pageSubtitle;
    public final TextView pageTitle;
    public final ImageView personalCheckIcon;
    public final TextView personalRadioButton;
    public final RadioGroup radioGroup2;
    private final ScrollView rootView;

    private AccountTypeFragmentBinding(ScrollView scrollView, ImageView imageView, TextView textView, KudiButton kudiButton, TextView textView2, TextView textView3, ImageView imageView2, TextView textView4, RadioGroup radioGroup) {
        this.rootView = scrollView;
        this.agentCheckIcon = imageView;
        this.agentRadioButton = textView;
        this.continueToNextPage = kudiButton;
        this.pageSubtitle = textView2;
        this.pageTitle = textView3;
        this.personalCheckIcon = imageView2;
        this.personalRadioButton = textView4;
        this.radioGroup2 = radioGroup;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static AccountTypeFragmentBinding bind(View view) {
        int $i0 = C0001R.C0003id.agent_check_icon;
        View $r1 = view.findViewById(C0001R.C0003id.agent_check_icon);
        ImageView $r2 = (ImageView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.agentRadioButton;
            View $r12 = view.findViewById(C0001R.C0003id.agentRadioButton);
            TextView textView = (TextView) $r12;
            if (textView != null) {
                $i0 = C0001R.C0003id.continueToNextPage;
                View $r13 = view.findViewById(C0001R.C0003id.continueToNextPage);
                KudiButton kudiButton = (KudiButton) $r13;
                if (kudiButton != null) {
                    $i0 = C0001R.C0003id.page_subtitle;
                    View $r14 = view.findViewById(C0001R.C0003id.page_subtitle);
                    TextView textView2 = (TextView) $r14;
                    if (textView2 != null) {
                        $i0 = C0001R.C0003id.page_title;
                        View $r15 = view.findViewById(C0001R.C0003id.page_title);
                        TextView textView3 = (TextView) $r15;
                        if (textView3 != null) {
                            $i0 = C0001R.C0003id.personal_check_icon;
                            View $r16 = view.findViewById(C0001R.C0003id.personal_check_icon);
                            ImageView imageView = (ImageView) $r16;
                            if (imageView != null) {
                                $i0 = C0001R.C0003id.personalRadioButton;
                                View $r17 = view.findViewById(C0001R.C0003id.personalRadioButton);
                                TextView $r8 = (TextView) $r17;
                                if ($r8 != null) {
                                    $i0 = C0001R.C0003id.radioGroup2;
                                    View $r18 = view.findViewById(C0001R.C0003id.radioGroup2);
                                    RadioGroup $r9 = (RadioGroup) $r18;
                                    if ($r9 != null) {
                                        ScrollView $r11 = (ScrollView) view;
                                        AccountTypeFragmentBinding $r10 = new AccountTypeFragmentBinding($r11, $r2, textView, kudiButton, textView2, textView3, imageView, $r8, $r9);
                                        return $r10;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Resources $r122 = view.getResources();
        String $r132 = $r122.getResourceName($i0);
        NullPointerException $r142 = new NullPointerException("Missing required view with ID: ".concat($r132));
        throw $r142;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static AccountTypeFragmentBinding inflate(LayoutInflater layoutInflater) {
        AccountTypeFragmentBinding $r0 = inflate(layoutInflater, null, false);
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
    public static AccountTypeFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.account_type_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        AccountTypeFragmentBinding $r3 = bind($r2);
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
