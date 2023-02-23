package ai.kudi.agent.core.databinding;

import ai.kudi.agent.core.C0038R;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class SelectBankLayoutBinding implements InterfaceC8209a {
    public final ImageView backButton;
    public final ProgressBar banksProgressBar;
    public final RecyclerView recyclerView;
    private final LinearLayout rootView;
    public final EditText searchView;

    private SelectBankLayoutBinding(LinearLayout linearLayout, ImageView imageView, ProgressBar progressBar, RecyclerView recyclerView, EditText editText) {
        this.rootView = linearLayout;
        this.backButton = imageView;
        this.banksProgressBar = progressBar;
        this.recyclerView = recyclerView;
        this.searchView = editText;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SelectBankLayoutBinding bind(View view) {
        int $i0 = C0038R.C0040id.back_button;
        View $r1 = view.findViewById($i0);
        ImageView $r2 = (ImageView) $r1;
        if ($r2 != null) {
            $i0 = C0038R.C0040id.banksProgressBar;
            View $r12 = view.findViewById($i0);
            ProgressBar $r3 = (ProgressBar) $r12;
            if ($r3 != null) {
                $i0 = C0038R.C0040id.viewPager;
                View $r13 = view.findViewById($i0);
                RecyclerView $r4 = (RecyclerView) $r13;
                if ($r4 != null) {
                    $i0 = C0038R.C0040id.searchView;
                    View $r14 = view.findViewById($i0);
                    EditText $r5 = (EditText) $r14;
                    if ($r5 != null) {
                        SelectBankLayoutBinding $r6 = new SelectBankLayoutBinding((LinearLayout) view, $r2, $r3, $r4, $r5);
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
    public static SelectBankLayoutBinding inflate(LayoutInflater layoutInflater) {
        SelectBankLayoutBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SelectBankLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0038R.C0041layout.select_bank_layout;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        SelectBankLayoutBinding $r3 = bind($r2);
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
