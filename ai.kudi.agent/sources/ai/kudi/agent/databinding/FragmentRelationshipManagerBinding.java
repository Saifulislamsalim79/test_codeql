package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.databinding.EmptyHistoryBinding;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentRelationshipManagerBinding implements InterfaceC8209a {
    public final CardView cardView;
    public final TextView chatOnWhatsappButton;
    public final EmptyHistoryBinding errorState;
    public final ShimmerFrameLayout loadingState;
    public final RecyclerView relationshipMgrRv;
    private final ConstraintLayout rootView;

    private FragmentRelationshipManagerBinding(ConstraintLayout constraintLayout, CardView cardView, TextView textView, EmptyHistoryBinding emptyHistoryBinding, ShimmerFrameLayout shimmerFrameLayout, RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.cardView = cardView;
        this.chatOnWhatsappButton = textView;
        this.errorState = emptyHistoryBinding;
        this.loadingState = shimmerFrameLayout;
        this.relationshipMgrRv = recyclerView;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentRelationshipManagerBinding bind(View view) {
        int $i0 = C0001R.C0003id.card_view;
        View $r1 = view.findViewById(C0001R.C0003id.card_view);
        CardView $r2 = (CardView) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.chat_on_whatsapp_button;
            View $r12 = view.findViewById(C0001R.C0003id.chat_on_whatsapp_button);
            TextView $r3 = (TextView) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.error_state;
                View $r13 = view.findViewById(C0001R.C0003id.error_state);
                if ($r13 != null) {
                    EmptyHistoryBinding $r4 = EmptyHistoryBinding.bind($r13);
                    $i0 = C0001R.C0003id.loading_state;
                    View $r14 = view.findViewById(C0001R.C0003id.loading_state);
                    ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) $r14;
                    if (shimmerFrameLayout != null) {
                        $i0 = C0001R.C0003id.relationship_mgr_rv;
                        View $r15 = view.findViewById(C0001R.C0003id.relationship_mgr_rv);
                        RecyclerView recyclerView = (RecyclerView) $r15;
                        if (recyclerView != null) {
                            FragmentRelationshipManagerBinding $r7 = new FragmentRelationshipManagerBinding((ConstraintLayout) view, $r2, $r3, $r4, shimmerFrameLayout, recyclerView);
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
    public static FragmentRelationshipManagerBinding inflate(LayoutInflater layoutInflater) {
        FragmentRelationshipManagerBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentRelationshipManagerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_relationship_manager, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentRelationshipManagerBinding $r3 = bind($r2);
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
