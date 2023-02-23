package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class BottomSheetShareTransactionBinding implements InterfaceC8209a {
    public final AppCompatTextView downloadAsPdfView;
    public final CardView notch;
    public final AppCompatTextView raiseAComplaint;
    public final AppCompatTextView refresh;
    private final LinearLayout rootView;
    public final AppCompatTextView shareView;

    private BottomSheetShareTransactionBinding(LinearLayout linearLayout, AppCompatTextView appCompatTextView, CardView cardView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4) {
        this.rootView = linearLayout;
        this.downloadAsPdfView = appCompatTextView;
        this.notch = cardView;
        this.raiseAComplaint = appCompatTextView2;
        this.refresh = appCompatTextView3;
        this.shareView = appCompatTextView4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static BottomSheetShareTransactionBinding bind(View view) {
        int $i0 = C0001R.C0003id.download_as_pdf_view;
        View $r1 = view.findViewById(C0001R.C0003id.download_as_pdf_view);
        AppCompatTextView $r2 = (AppCompatTextView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.notch;
            View $r12 = view.findViewById(C0001R.C0003id.notch);
            CardView $r3 = (CardView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.raise_a_complaint;
                View $r13 = view.findViewById(C0001R.C0003id.raise_a_complaint);
                AppCompatTextView $r4 = (AppCompatTextView) $r13;
                if ($r4 != null) {
                    $i0 = C0001R.C0003id.refresh;
                    View $r14 = view.findViewById(C0001R.C0003id.refresh);
                    AppCompatTextView appCompatTextView = (AppCompatTextView) $r14;
                    if (appCompatTextView != null) {
                        $i0 = C0001R.C0003id.share_view;
                        View $r15 = view.findViewById(C0001R.C0003id.share_view);
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) $r15;
                        if (appCompatTextView2 != null) {
                            LinearLayout $r8 = (LinearLayout) view;
                            BottomSheetShareTransactionBinding $r7 = new BottomSheetShareTransactionBinding($r8, $r2, $r3, $r4, appCompatTextView, appCompatTextView2);
                            return $r7;
                        }
                    }
                }
            }
        }
        Resources $r9 = view.getResources();
        String $r10 = $r9.getResourceName($i0);
        NullPointerException $r11 = new NullPointerException("Missing required view with ID: ".concat($r10));
        throw $r11;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static BottomSheetShareTransactionBinding inflate(LayoutInflater layoutInflater) {
        BottomSheetShareTransactionBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static BottomSheetShareTransactionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.bottom_sheet_share_transaction, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        BottomSheetShareTransactionBinding $r3 = bind($r2);
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
