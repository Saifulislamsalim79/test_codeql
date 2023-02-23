package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class SelectBankWithUssdLayoutBinding implements InterfaceC8209a {
    public final ImageView backButton;
    public final RecyclerView mRecyclerView;
    private final LinearLayout rootView;
    public final EditText searchView;

    private SelectBankWithUssdLayoutBinding(LinearLayout linearLayout, ImageView imageView, RecyclerView recyclerView, EditText editText) {
        this.rootView = linearLayout;
        this.backButton = imageView;
        this.mRecyclerView = recyclerView;
        this.searchView = editText;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SelectBankWithUssdLayoutBinding bind(View view) {
        int $i0 = C0001R.C0003id.back_button;
        View $r1 = view.findViewById(C0001R.C0003id.back_button);
        ImageView $r2 = (ImageView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.f3rv;
            View $r12 = view.findViewById(C0001R.C0003id.f3rv);
            RecyclerView $r3 = (RecyclerView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.searchView;
                View $r13 = view.findViewById(C0001R.C0003id.searchView);
                EditText $r4 = (EditText) $r13;
                if ($r4 != null) {
                    LinearLayout $r6 = (LinearLayout) view;
                    SelectBankWithUssdLayoutBinding $r5 = new SelectBankWithUssdLayoutBinding($r6, $r2, $r3, $r4);
                    return $r5;
                }
            }
        }
        Resources $r7 = view.getResources();
        String $r8 = $r7.getResourceName($i0);
        NullPointerException $r9 = new NullPointerException("Missing required view with ID: ".concat($r8));
        throw $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SelectBankWithUssdLayoutBinding inflate(LayoutInflater layoutInflater) {
        SelectBankWithUssdLayoutBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SelectBankWithUssdLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.select_bank_with_ussd_layout, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        SelectBankWithUssdLayoutBinding $r3 = bind($r2);
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
