package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class ActivityHelpBinding implements InterfaceC8209a {
    public final LinearLayout chatLiveLayout;
    public final ImageView faqImageView;
    public final LinearLayout faqLayout;
    public final TextView faqTextView;
    public final RecyclerView helpRecyclerview;
    public final TextView infoText;
    public final ImageView liveChatImageView;
    public final TextView liveChatTextView;
    public final ProgressBar progressBar;
    private final LinearLayout rootView;
    public final ImageView submitIssueImageView;
    public final LinearLayout submitIssueLayout;
    public final TextView submitIssueTextView;

    private ActivityHelpBinding(LinearLayout linearLayout, LinearLayout linearLayout2, ImageView imageView, LinearLayout linearLayout3, TextView textView, RecyclerView recyclerView, TextView textView2, ImageView imageView2, TextView textView3, ProgressBar progressBar, ImageView imageView3, LinearLayout linearLayout4, TextView textView4) {
        this.rootView = linearLayout;
        this.chatLiveLayout = linearLayout2;
        this.faqImageView = imageView;
        this.faqLayout = linearLayout3;
        this.faqTextView = textView;
        this.helpRecyclerview = recyclerView;
        this.infoText = textView2;
        this.liveChatImageView = imageView2;
        this.liveChatTextView = textView3;
        this.progressBar = progressBar;
        this.submitIssueImageView = imageView3;
        this.submitIssueLayout = linearLayout4;
        this.submitIssueTextView = textView4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityHelpBinding bind(View view) {
        int $i0 = C0001R.C0003id.chatLiveLayout;
        View $r1 = view.findViewById(C0001R.C0003id.chatLiveLayout);
        LinearLayout linearLayout = (LinearLayout) $r1;
        if (linearLayout != null) {
            $i0 = C0001R.C0003id.faqImageView;
            View $r12 = view.findViewById(C0001R.C0003id.faqImageView);
            ImageView imageView = (ImageView) $r12;
            if (imageView != null) {
                $i0 = C0001R.C0003id.faqLayout;
                View $r13 = view.findViewById(C0001R.C0003id.faqLayout);
                LinearLayout linearLayout2 = (LinearLayout) $r13;
                if (linearLayout2 != null) {
                    $i0 = C0001R.C0003id.faqTextView;
                    View $r14 = view.findViewById(C0001R.C0003id.faqTextView);
                    TextView textView = (TextView) $r14;
                    if (textView != null) {
                        $i0 = C0001R.C0003id.help_recyclerview;
                        View $r15 = view.findViewById(C0001R.C0003id.help_recyclerview);
                        RecyclerView recyclerView = (RecyclerView) $r15;
                        if (recyclerView != null) {
                            $i0 = C0001R.C0003id.info_text;
                            View $r16 = view.findViewById(C0001R.C0003id.info_text);
                            TextView textView2 = (TextView) $r16;
                            if (textView2 != null) {
                                $i0 = C0001R.C0003id.liveChatImageView;
                                View $r17 = view.findViewById(C0001R.C0003id.liveChatImageView);
                                ImageView $r8 = (ImageView) $r17;
                                if ($r8 != null) {
                                    $i0 = C0001R.C0003id.liveChatTextView;
                                    View $r18 = view.findViewById(C0001R.C0003id.liveChatTextView);
                                    TextView $r9 = (TextView) $r18;
                                    if ($r9 != null) {
                                        $i0 = C0001R.C0003id.progress_bar;
                                        View $r19 = view.findViewById(C0001R.C0003id.progress_bar);
                                        ProgressBar $r10 = (ProgressBar) $r19;
                                        if ($r10 != null) {
                                            $i0 = C0001R.C0003id.submitIssueImageView;
                                            View $r110 = view.findViewById(C0001R.C0003id.submitIssueImageView);
                                            ImageView $r11 = (ImageView) $r110;
                                            if ($r11 != null) {
                                                $i0 = C0001R.C0003id.submitIssueLayout;
                                                View $r111 = view.findViewById(C0001R.C0003id.submitIssueLayout);
                                                LinearLayout $r122 = (LinearLayout) $r111;
                                                if ($r122 != null) {
                                                    $i0 = C0001R.C0003id.submitIssueTextView;
                                                    View $r112 = view.findViewById(C0001R.C0003id.submitIssueTextView);
                                                    TextView $r132 = (TextView) $r112;
                                                    if ($r132 != null) {
                                                        LinearLayout $r152 = (LinearLayout) view;
                                                        ActivityHelpBinding $r142 = new ActivityHelpBinding($r152, linearLayout, imageView, linearLayout2, textView, recyclerView, textView2, $r8, $r9, $r10, $r11, $r122, $r132);
                                                        return $r142;
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
        Resources $r162 = view.getResources();
        String $r172 = $r162.getResourceName($i0);
        NullPointerException $r182 = new NullPointerException("Missing required view with ID: ".concat($r172));
        throw $r182;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityHelpBinding inflate(LayoutInflater layoutInflater) {
        ActivityHelpBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ActivityHelpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.activity_help, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        ActivityHelpBinding $r3 = bind($r2);
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
