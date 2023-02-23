package ai.kudi.agent.users.adapter;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.util.image.ImageUtil;
import ai.kudi.agent.users.domain.dto.KCashInstruction;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import kotlin.p557z.C13726r;
/* compiled from: KCashBanksAdapter.kt */
@Metadata(m10422d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J\"\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0019"}, m10421d2 = {"Lai/kudi/agent/users/adapter/KCashBanksAdapter;", "Landroid/widget/BaseAdapter;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "instructions", "", "Lai/kudi/agent/users/domain/dto/KCashInstruction;", "getInstructions", "()Ljava/util/List;", "setInstructions", "(Ljava/util/List;)V", "getCount", "", "getItem", "position", "getItemId", "", "getView", "Landroid/view/View;", "view", "root", "Landroid/view/ViewGroup;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class KCashBanksAdapter extends BaseAdapter {
    private final Context context;
    private List<KCashInstruction> instructions;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public KCashBanksAdapter(Context context) {
        List $r1;
        Log_OC.getArray(context, "context");
        this.context = context;
        $r1 = C13726r.m3891e();
        this.instructions = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Context getContext() {
        Context r1 = this.context;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.widget.Adapter
    public int getCount() {
        List $r1 = this.instructions;
        int $i0 = $r1.size();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getInstructions() {
        List r1 = this.instructions;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.widget.Adapter
    public ai.kudi.agent.users.domain.package_1.KCashInstruction getItem(int i) {
        List $r1 = this.instructions;
        Object $r2 = $r1.get(i);
        ai.kudi.agent.users.domain.package_1.KCashInstruction $r3 = (ai.kudi.agent.users.domain.package_1.KCashInstruction) $r2;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.widget.Adapter
    public /* bridge */ /* synthetic */ Object getItem(int i) {
        ai.kudi.agent.users.domain.package_1.KCashInstruction $r1 = getItem(i);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.widget.Adapter
    public long getItemId(int i) {
        long $l1 = i;
        return $l1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.widget.Adapter
    public View getView(int i, View $r1, ViewGroup viewGroup) {
        boolean $z0;
        Log_OC.getArray(viewGroup, "root");
        ai.kudi.agent.users.domain.package_1.KCashInstruction $r3 = getItem(i);
        if ($r1 == null) {
            $r1 = null;
        }
        if ($r1 == null) {
            Context $r4 = this.context;
            LayoutInflater $r5 = LayoutInflater.from($r4);
            $r1 = $r5.inflate(C0001R.C0004layout.include_kcash_bank_listing, viewGroup, false);
        }
        View $r6 = $r1.findViewById(C0001R.C0003id.bankLogoImageView);
        ImageView $r7 = (ImageView) $r6;
        String $r8 = $r3.getBankLogo();
        $z0 = C13276s.m5440u($r8);
        if ($z0) {
            $r7.setImageDrawable(null);
        } else {
            ImageUtil.Companion $r9 = ImageUtil.Companion;
            Context $r42 = this.context;
            String $r82 = $r3.getBankLogo();
            Log_OC.loadImage($r7, "logo");
            $r9.load($r42, $r82, $r7);
        }
        View $r62 = $r1.findViewById(C0001R.C0003id.bankNameTextView);
        TextView $r10 = (TextView) $r62;
        String $r83 = $r3.getBankName();
        $r10.setText($r83);
        Log_OC.loadImage($r1, "cardView");
        return $r1;
    }

    public final void setInstructions(List list) {
        Log_OC.getArray(list, "<set-?>");
        this.instructions = list;
    }
}
