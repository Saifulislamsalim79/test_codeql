package ai.kudi.agent.settings.p029ui.adapters;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.domain.room_entities.BankAccount;
import ai.kudi.agent.wallettopup.data.BanksWithMethods;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: AccountNumberAdapter.kt */
@Metadata(m10422d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0013\u0014B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\bH\u0016J\u001c\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0014\u0010\u0011\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m10421d2 = {"Lai/kudi/agent/settings/ui/adapters/AccountNumberAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lai/kudi/agent/settings/ui/adapters/AccountNumberAdapter$ViewHolder;", "()V", "bankAccounts", "", "Lai/kudi/agent/core/domain/room_entities/BankAccount;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateBankAccounts", AttributeType.LIST, "AccountNumbersViewHolder", "ViewHolder", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.ui.adapters.AccountNumberAdapter */
/* loaded from: classes.dex */
public final class AccountNumberAdapter extends RecyclerView.AbstractC1623h<ViewHolder> {
    private final List<BankAccount> bankAccounts;

    /* compiled from: AccountNumberAdapter.kt */
    @Metadata(m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0010"}, m10421d2 = {"Lai/kudi/agent/settings/ui/adapters/AccountNumberAdapter$AccountNumbersViewHolder;", "Lai/kudi/agent/settings/ui/adapters/AccountNumberAdapter$ViewHolder;", "Lai/kudi/agent/settings/ui/adapters/AccountNumberAdapter;", "container", "Landroid/view/View;", "(Lai/kudi/agent/settings/ui/adapters/AccountNumberAdapter;Landroid/view/View;)V", BanksWithMethods.ACCOUNT_NAME, "Landroid/widget/TextView;", "getAccountName", "()Landroid/widget/TextView;", BanksWithMethods.ACCOUNT_NUMBER, "getAccountNumber", "bindAccountNumbers", "", "detail", "Lai/kudi/agent/core/domain/room_entities/BankAccount;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.settings.ui.adapters.AccountNumberAdapter$AccountNumbersViewHolder */
    /* loaded from: classes.dex */
    public final class AccountNumbersViewHolder extends ViewHolder {
        private final TextView accountName;
        private final TextView accountNumber;
        final /* synthetic */ AccountNumberAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public AccountNumbersViewHolder(AccountNumberAdapter accountNumberAdapter, View view) {
            super(accountNumberAdapter, view);
            Log_OC.getArray(accountNumberAdapter, "this$0");
            Log_OC.getArray(view, "container");
            this.this$0 = accountNumberAdapter;
            View $r3 = view.findViewById(C0001R.C0003id.accountName);
            Log_OC.loadImage($r3, "container.findViewById(R.id.accountName)");
            TextView $r4 = (TextView) $r3;
            this.accountName = $r4;
            View $r2 = view.findViewById(C0001R.C0003id.accountNumber);
            Log_OC.loadImage($r2, "container.findViewById(R.id.accountNumber)");
            TextView $r42 = (TextView) $r2;
            this.accountNumber = $r42;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.settings.p029ui.adapters.AccountNumberAdapter.ViewHolder
        public void bindAccountNumbers(BankAccount bankAccount) {
            Log_OC.getArray(bankAccount, "detail");
            TextView $r2 = this.accountName;
            String $r3 = bankAccount.getAccountName();
            $r2.setText($r3);
            TextView $r22 = this.accountNumber;
            StringBuilder $r4 = new StringBuilder();
            String $r32 = bankAccount.getAccountNumber();
            $r4.append($r32);
            $r4.append(" - ");
            String $r33 = bankAccount.getBankName();
            $r4.append($r33);
            String $r34 = $r4.toString();
            $r22.setText($r34);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final TextView getAccountName() {
            TextView r1 = this.accountName;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final TextView getAccountNumber() {
            TextView r1 = this.accountNumber;
            return r1;
        }
    }

    /* compiled from: AccountNumberAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b¦\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/settings/ui/adapters/AccountNumberAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "container", "Landroid/view/View;", "(Lai/kudi/agent/settings/ui/adapters/AccountNumberAdapter;Landroid/view/View;)V", "getContainer", "()Landroid/view/View;", "bindAccountNumbers", "", "detail", "Lai/kudi/agent/core/domain/room_entities/BankAccount;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.settings.ui.adapters.AccountNumberAdapter$ViewHolder */
    /* loaded from: classes.dex */
    public abstract class ViewHolder extends RecyclerView.AbstractC1620e0 {
        private final View container;
        final /* synthetic */ AccountNumberAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(AccountNumberAdapter accountNumberAdapter, View view) {
            super(view);
            Log_OC.getArray(accountNumberAdapter, "this$0");
            Log_OC.getArray(view, "container");
            this.this$0 = accountNumberAdapter;
            this.container = view;
        }

        public abstract void bindAccountNumbers(BankAccount bankAccount);

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        protected final View getContainer() {
            View r1 = this.container;
            return r1;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AccountNumberAdapter() {
        ArrayList $r1 = new ArrayList();
        this.bankAccounts = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        List $r1 = this.bankAccounts;
        int $i0 = $r1.size();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(ViewHolder viewHolder, int i) {
        Log_OC.getArray(viewHolder, "holder");
        List $r3 = this.bankAccounts;
        Object $r2 = $r3.get(i);
        BankAccount $r4 = (BankAccount) $r2;
        viewHolder.bindAccountNumbers($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
        ViewHolder $r2 = viewHolder;
        onBindViewHolder2($r2, i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log_OC.getArray(viewGroup, "parent");
        Context $r3 = viewGroup.getContext();
        LayoutInflater $r4 = LayoutInflater.from($r3);
        View $r5 = $r4.inflate(C0001R.C0004layout.list_item_bank_account_numbers, viewGroup, false);
        Log_OC.loadImage($r5, "from(parent.context).inflate(\n                R.layout.list_item_bank_account_numbers,\n                parent,\n                false\n            )");
        AccountNumbersViewHolder $r2 = new AccountNumbersViewHolder(this, $r5);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void updateBankAccounts(List list) {
        Log_OC.getArray(list, AttributeType.LIST);
        List $r2 = this.bankAccounts;
        $r2.clear();
        List $r22 = this.bankAccounts;
        $r22.addAll(list);
        notifyDataSetChanged();
    }
}
