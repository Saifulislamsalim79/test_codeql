package ai.kudi.agent.savings.databinding;

import ai.kudi.agent.custom.views.CustomBgTextview;
import ai.kudi.agent.savings.C0456R;
import ai.kudi.dip.library.button.KudiButton;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class SheetLockSavingsBinding implements InterfaceC8209a {
    public final ImageView close;
    public final CustomBgTextview notch;
    public final KudiButton proceedButton;
    private final LinearLayout rootView;
    public final TextView tvCancel;
    public final TextView tvLockSavingsBody;
    public final TextView tvLockSavingsTitle;

    private SheetLockSavingsBinding(LinearLayout linearLayout, ImageView imageView, CustomBgTextview customBgTextview, KudiButton kudiButton, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = linearLayout;
        this.close = imageView;
        this.notch = customBgTextview;
        this.proceedButton = kudiButton;
        this.tvCancel = textView;
        this.tvLockSavingsBody = textView2;
        this.tvLockSavingsTitle = textView3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SheetLockSavingsBinding bind(View view) {
        int $i0 = C0456R.C0458id.close;
        View $r1 = view.findViewById($i0);
        ImageView $r2 = (ImageView) $r1;
        if ($r2 != null) {
            $i0 = C0456R.C0458id.notch;
            View $r12 = view.findViewById($i0);
            CustomBgTextview $r3 = (CustomBgTextview) $r12;
            if ($r3 != null) {
                $i0 = C0456R.C0458id.proceedButton;
                View $r13 = view.findViewById($i0);
                KudiButton $r4 = (KudiButton) $r13;
                if ($r4 != null) {
                    $i0 = C0456R.C0458id.tvCancel;
                    View $r14 = view.findViewById($i0);
                    TextView textView = (TextView) $r14;
                    if (textView != null) {
                        $i0 = C0456R.C0458id.tvLockSavingsBody;
                        View $r15 = view.findViewById($i0);
                        TextView textView2 = (TextView) $r15;
                        if (textView2 != null) {
                            $i0 = C0456R.C0458id.tvLockSavingsTitle;
                            View $r16 = view.findViewById($i0);
                            TextView textView3 = (TextView) $r16;
                            if (textView3 != null) {
                                LinearLayout $r9 = (LinearLayout) view;
                                SheetLockSavingsBinding $r8 = new SheetLockSavingsBinding($r9, $r2, $r3, $r4, textView, textView2, textView3);
                                return $r8;
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
    public static SheetLockSavingsBinding inflate(LayoutInflater layoutInflater) {
        SheetLockSavingsBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SheetLockSavingsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0456R.C0459layout.sheet_lock_savings;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        SheetLockSavingsBinding $r3 = bind($r2);
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
