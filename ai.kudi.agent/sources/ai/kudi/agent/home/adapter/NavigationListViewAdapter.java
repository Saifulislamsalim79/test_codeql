package ai.kudi.agent.home.adapter;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.databinding.NavMenuListItemBinding;
import ai.kudi.agent.home.HomeActivity;
import ai.kudi.agent.home.adapter.NavigationListViewAdapter;
import ai.kudi.agent.transactions.p032ui.bottomsheet.SendReceiptToTerminalConfirmationBottomSheet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC1736q;
import androidx.recyclerview.widget.C1713j;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p590o.p591a.Timber;
/* compiled from: NavigationListViewAdapter.kt */
@Metadata(m10422d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 /2\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0003/01B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u0002J\u001c\u0010 \u001a\u00020\u00142\n\u0010!\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\"\u001a\u00020#H\u0016J\u001c\u0010$\u001a\u00060\u0003R\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020#H\u0016J\u000e\u0010(\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u0002J\u000e\u0010)\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u0007J\u0010\u0010+\u001a\u00020,2\u0006\u0010\u0013\u001a\u00020\u0002H\u0002J\u000e\u0010-\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u0002J\u0016\u0010.\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020#R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R7\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R!\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u001aj\b\u0012\u0004\u0012\u00020\u0002`\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u00062"}, m10421d2 = {"Lai/kudi/agent/home/adapter/NavigationListViewAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lai/kudi/agent/home/adapter/NavigationListViewAdapter$MenuItem;", "Lai/kudi/agent/home/adapter/NavigationListViewAdapter$NavigationViewHolder;", "context", "Landroid/content/Context;", "customerType", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/SharedPreferences;)V", "arrayOfMenuItem", "", "getArrayOfMenuItem", "()Ljava/util/List;", "listener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "menu", "", "getListener", "()Lkotlin/jvm/functions/Function1;", "setListener", "(Lkotlin/jvm/functions/Function1;)V", "menuItems", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getMenuItems", "()Ljava/util/ArrayList;", "addMenuItem", "menuItem", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeMenuItem", "selectItem", "selectedItem", "shouldAddMenu", "", "updateMenuList", "updateMenuListAtPosition", "Companion", "MenuItem", "NavigationViewHolder", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class NavigationListViewAdapter extends AbstractC1736q<MenuItem, NavigationViewHolder> {
    public static final Companion Companion;
    private static final NavigationListViewAdapter$Companion$DIFF_CALLBACK$1 DIFF_CALLBACK;
    private final List<MenuItem> arrayOfMenuItem;
    private final Context context;
    private final String customerType;
    private InterfaceC11767l<? super MenuItem, C13666w> listener;
    private final ArrayList<MenuItem> menuItems;

    /* compiled from: NavigationListViewAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003*\u0001\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/home/adapter/NavigationListViewAdapter$Companion;", "", "()V", "DIFF_CALLBACK", "ai/kudi/agent/home/adapter/NavigationListViewAdapter$Companion$DIFF_CALLBACK$1", "Lai/kudi/agent/home/adapter/NavigationListViewAdapter$Companion$DIFF_CALLBACK$1;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }
    }

    /* compiled from: NavigationListViewAdapter.kt */
    @Metadata(m10422d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\b\u0086\b\u0018\u00002\u00020\u0001:\u000201BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\u000bHÆ\u0003J\t\u0010*\u001a\u00020\rHÆ\u0003JO\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010,\u001a\u00020\b2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0005HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000f\"\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u00062"}, m10421d2 = {"Lai/kudi/agent/home/adapter/NavigationListViewAdapter$MenuItem;", "", "itemName", "", "itemIcon", "", "key", "isNewFeature", "", "isSelected", "menuType", "Lai/kudi/agent/home/adapter/NavigationListViewAdapter$MenuItem$UserType;", SendReceiptToTerminalConfirmationBottomSheet.STATE, "Lai/kudi/agent/home/adapter/NavigationListViewAdapter$MenuItem$State;", "(Ljava/lang/String;ILjava/lang/String;ZZLai/kudi/agent/home/adapter/NavigationListViewAdapter$MenuItem$UserType;Lai/kudi/agent/home/adapter/NavigationListViewAdapter$MenuItem$State;)V", "()Z", "setNewFeature", "(Z)V", "setSelected", "getItemIcon", "()I", "setItemIcon", "(I)V", "getItemName", "()Ljava/lang/String;", "setItemName", "(Ljava/lang/String;)V", "getKey", "getMenuType", "()Lai/kudi/agent/home/adapter/NavigationListViewAdapter$MenuItem$UserType;", "setMenuType", "(Lai/kudi/agent/home/adapter/NavigationListViewAdapter$MenuItem$UserType;)V", "getState", "()Lai/kudi/agent/home/adapter/NavigationListViewAdapter$MenuItem$State;", "setState", "(Lai/kudi/agent/home/adapter/NavigationListViewAdapter$MenuItem$State;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "State", "UserType", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class MenuItem {
        private boolean isNewFeature;
        private boolean isSelected;
        private int itemIcon;
        private String itemName;
        private UserType menuType;
        private final String range;
        private State state;

        /* compiled from: NavigationListViewAdapter.kt */
        @Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/home/adapter/NavigationListViewAdapter$MenuItem$State;", "", "(Ljava/lang/String;I)V", "LOADED", "LOADING", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
        /* loaded from: classes.dex */
        public static final class State {
            private static final /* synthetic */ State[] $VALUES;
            public static final State LOADED;
            public static final State LOADING;

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private static final /* synthetic */ State[] $values() {
                State $r1 = LOADED;
                State $r12 = LOADING;
                State[] $r0 = {$r1, $r12};
                return $r0;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            static {
                State $r1 = new State("LOADED", 0);
                LOADED = $r1;
                State $r12 = new State("LOADING", 1);
                LOADING = $r12;
                State[] $r0 = $values();
                $VALUES = $r0;
            }

            private State(String str, int i) {
                super(str, i);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public static State valueOf(String str) {
                Enum $r0 = Enum.valueOf(State.class, str);
                State $r2 = (State) $r0;
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public static State[] values() {
                State[] $r1 = $VALUES;
                Object $r0 = $r1.clone();
                State[] $r12 = (State[]) $r0;
                return $r12;
            }
        }

        /* compiled from: NavigationListViewAdapter.kt */
        @Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/home/adapter/NavigationListViewAdapter$MenuItem$UserType;", "", "(Ljava/lang/String;I)V", "AGENT", "USER", "ALL", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
        /* loaded from: classes.dex */
        public static final class UserType {
            private static final /* synthetic */ UserType[] $VALUES;
            public static final UserType AGENT;
            public static final UserType AUTO;
            public static final UserType USER;

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            private static final /* synthetic */ UserType[] $values() {
                UserType $r1 = AGENT;
                UserType $r12 = USER;
                UserType $r13 = AUTO;
                UserType[] $r0 = {$r1, $r12, $r13};
                return $r0;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            static {
                UserType $r1 = new UserType("AGENT", 0);
                AGENT = $r1;
                UserType $r12 = new UserType("USER", 1);
                USER = $r12;
                UserType $r13 = new UserType("ALL", 2);
                AUTO = $r13;
                UserType[] $r0 = $values();
                $VALUES = $r0;
            }

            private UserType(String str, int i) {
                super(str, i);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public static UserType valueOf(String str) {
                Enum $r0 = Enum.valueOf(UserType.class, str);
                UserType $r2 = (UserType) $r0;
                return $r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public static UserType[] values() {
                UserType[] $r1 = $VALUES;
                Object $r0 = $r1.clone();
                UserType[] $r12 = (UserType[]) $r0;
                return $r12;
            }
        }

        public MenuItem(String str, int i, String str2, boolean z, boolean z2, UserType userType, State state) {
            Log_OC.getArray(str, "itemName");
            Log_OC.getArray(str2, "key");
            Log_OC.getArray(userType, "menuType");
            Log_OC.getArray(state, SendReceiptToTerminalConfirmationBottomSheet.STATE);
            this.itemName = str;
            this.itemIcon = i;
            this.range = str2;
            this.isNewFeature = z;
            this.isSelected = z2;
            this.menuType = userType;
            this.state = state;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ MenuItem(java.lang.String r2, int r3, java.lang.String r4, boolean r5, boolean r6, ai.kudi.agent.home.adapter.NavigationListViewAdapter.MenuItem.UserType r7, ai.kudi.agent.home.adapter.NavigationListViewAdapter.MenuItem.State r8, int r9, kotlin.p483e0.p485d.DBUtils$1 r10) {
            /*
                r1 = this;
                r0 = r9 & 4
                if (r0 == 0) goto L7
                java.lang.String r4 = ""
                goto L7
            L7:
                r0 = r9 & 8
                if (r0 == 0) goto Ld
                r5 = 0
                goto Ld
            Ld:
                r0 = r9 & 16
                if (r0 == 0) goto L13
                r6 = 0
                goto L13
            L13:
                r0 = r9 & 32
                if (r0 == 0) goto L1a
                ai.kudi.agent.home.adapter.NavigationListViewAdapter$MenuItem$UserType r7 = ai.kudi.agent.home.adapter.NavigationListViewAdapter.MenuItem.UserType.AUTO
                goto L1a
            L1a:
                r9 = r9 & 64
                if (r9 == 0) goto L21
                ai.kudi.agent.home.adapter.NavigationListViewAdapter$MenuItem$State r8 = ai.kudi.agent.home.adapter.NavigationListViewAdapter.MenuItem.State.LOADED
                goto L21
            L21:
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.home.adapter.NavigationListViewAdapter.MenuItem.<init>(java.lang.String, int, java.lang.String, boolean, boolean, ai.kudi.agent.home.adapter.NavigationListViewAdapter$MenuItem$UserType, ai.kudi.agent.home.adapter.NavigationListViewAdapter$MenuItem$State, int, kotlin.e0.d.DBUtils$1):void");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ MenuItem copy$default(MenuItem menuItem, String $r3, int $i0, String $r0, boolean $z0, boolean $z1, UserType $r1, State $r4, int i, Object obj) {
            int $i2 = i & 1;
            if ($i2 != 0) {
                $r3 = menuItem.itemName;
            }
            int $i22 = i & 2;
            if ($i22 != 0) {
                $i0 = menuItem.itemIcon;
            }
            int $i23 = i & 4;
            if ($i23 != 0) {
                $r0 = menuItem.range;
            }
            int $i24 = i & 8;
            if ($i24 != 0) {
                $z0 = menuItem.isNewFeature;
            }
            int $i25 = i & 16;
            if ($i25 != 0) {
                $z1 = menuItem.isSelected;
            }
            int $i26 = i & 32;
            if ($i26 != 0) {
                $r1 = menuItem.menuType;
            }
            int $i1 = i & 64;
            if ($i1 != 0) {
                $r4 = menuItem.state;
            }
            MenuItem $r2 = menuItem.copy($r3, $i0, $r0, $z0, $z1, $r1, $r4);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component1() {
            String r1 = this.itemName;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final int component2() {
            int i0 = this.itemIcon;
            return i0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component3() {
            String r1 = this.range;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final boolean component4() {
            boolean z0 = this.isNewFeature;
            return z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final boolean component5() {
            boolean z0 = this.isSelected;
            return z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final UserType component6() {
            UserType r1 = this.menuType;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final State component7() {
            State r1 = this.state;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final MenuItem copy(String str, int i, String str2, boolean z, boolean z2, UserType userType, State state) {
            Log_OC.getArray(str, "itemName");
            Log_OC.getArray(str2, "key");
            Log_OC.getArray(userType, "menuType");
            Log_OC.getArray(state, SendReceiptToTerminalConfirmationBottomSheet.STATE);
            MenuItem $r0 = new MenuItem(str, i, str2, z, z2, userType, state);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            boolean $z0 = obj instanceof MenuItem;
            if ($z0) {
                MenuItem $r2 = (MenuItem) obj;
                String $r3 = this.itemName;
                String $r4 = $r2.itemName;
                boolean $z02 = Log_OC.append($r3, $r4);
                if ($z02) {
                    int $i0 = this.itemIcon;
                    int $i1 = $r2.itemIcon;
                    if ($i0 != $i1) {
                        return false;
                    }
                    String $r32 = this.range;
                    String $r42 = $r2.range;
                    boolean $z03 = Log_OC.append($r32, $r42);
                    if ($z03) {
                        boolean $z04 = this.isNewFeature;
                        boolean $z1 = $r2.isNewFeature;
                        if ($z04 != $z1) {
                            return false;
                        }
                        boolean $z05 = this.isSelected;
                        boolean $z12 = $r2.isSelected;
                        if ($z05 != $z12) {
                            return false;
                        }
                        UserType $r5 = this.menuType;
                        UserType $r6 = $r2.menuType;
                        if ($r5 != $r6) {
                            return false;
                        }
                        State $r7 = this.state;
                        State $r8 = $r2.state;
                        return $r7 == $r8;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final int getItemIcon() {
            int i0 = this.itemIcon;
            return i0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getItemName() {
            String r1 = this.itemName;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getKey() {
            String r1 = this.range;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final UserType getMenuType() {
            UserType r1 = this.menuType;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final State getState() {
            State r1 = this.state;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            String $r1 = this.itemName;
            int $i0 = $r1.hashCode();
            int $i1 = this.itemIcon;
            String $r12 = this.range;
            int $i12 = $r12.hashCode();
            int $i02 = (((($i0 * 31) + $i1) * 31) + $i12) * 31;
            boolean $z0 = this.isNewFeature;
            int i = $z0;
            if ($z0 != 0) {
                i = 1;
            }
            int $i13 = i;
            int $i03 = ($i02 + $i13) * 31;
            boolean $z02 = this.isSelected;
            int $i14 = $z02 ? 1 : $z02 ? 1 : 0;
            UserType $r2 = this.menuType;
            int $i15 = $r2.hashCode();
            State $r3 = this.state;
            int $i16 = $r3.hashCode();
            return (((($i03 + $i14) * 31) + $i15) * 31) + $i16;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final boolean isNewFeature() {
            boolean z0 = this.isNewFeature;
            return z0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final boolean isSelected() {
            boolean z0 = this.isSelected;
            return z0;
        }

        public final void setItemIcon(int i) {
            this.itemIcon = i;
        }

        public final void setItemName(String str) {
            Log_OC.getArray(str, "<set-?>");
            this.itemName = str;
        }

        public final void setMenuType(UserType userType) {
            Log_OC.getArray(userType, "<set-?>");
            this.menuType = userType;
        }

        public final void setNewFeature(boolean z) {
            this.isNewFeature = z;
        }

        public final void setSelected(boolean z) {
            this.isSelected = z;
        }

        public final void setState(State state) {
            Log_OC.getArray(state, "<set-?>");
            this.state = state;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r2 = new StringBuilder();
            $r2.append("MenuItem(itemName=");
            String $r1 = this.itemName;
            $r2.append($r1);
            $r2.append(", itemIcon=");
            int $i0 = this.itemIcon;
            $r2.append($i0);
            $r2.append(", key=");
            String $r12 = this.range;
            $r2.append($r12);
            $r2.append(", isNewFeature=");
            boolean $z0 = this.isNewFeature;
            $r2.append($z0);
            $r2.append(", isSelected=");
            boolean $z02 = this.isSelected;
            $r2.append($z02);
            $r2.append(", menuType=");
            UserType $r3 = this.menuType;
            $r2.append($r3);
            $r2.append(", state=");
            State $r4 = this.state;
            $r2.append($r4);
            $r2.append(')');
            String $r13 = $r2.toString();
            return $r13;
        }
    }

    /* compiled from: NavigationListViewAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/home/adapter/NavigationListViewAdapter$NavigationViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lai/kudi/agent/databinding/NavMenuListItemBinding;", "(Lai/kudi/agent/home/adapter/NavigationListViewAdapter;Lai/kudi/agent/databinding/NavMenuListItemBinding;)V", "getBinding", "()Lai/kudi/agent/databinding/NavMenuListItemBinding;", "bind", "", "menuItem", "Lai/kudi/agent/home/adapter/NavigationListViewAdapter$MenuItem;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public final class NavigationViewHolder extends RecyclerView.AbstractC1620e0 {
        private final NavMenuListItemBinding binding;
        final /* synthetic */ NavigationListViewAdapter this$0;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public NavigationViewHolder(ai.kudi.agent.home.adapter.NavigationListViewAdapter r5, ai.kudi.agent.databinding.NavMenuListItemBinding r6) {
            /*
                r4 = this;
                java.lang.String r0 = "this$0"
                kotlin.p483e0.p485d.Log_OC.getArray(r5, r0)
                java.lang.String r0 = "binding"
                kotlin.p483e0.p485d.Log_OC.getArray(r6, r0)
                r4.this$0 = r5
                androidx.constraintlayout.widget.ConstraintLayout r1 = r6.getRoot()
                r3 = r1
                android.view.View r3 = (android.view.View) r3
                r2 = r3
                r4.<init>(r2)
                r4.binding = r6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.home.adapter.NavigationListViewAdapter.NavigationViewHolder.<init>(ai.kudi.agent.home.adapter.NavigationListViewAdapter, ai.kudi.agent.databinding.NavMenuListItemBinding):void");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* renamed from: bind$lambda-0 */
        public static final void m39327bind$lambda0(NavigationListViewAdapter navigationListViewAdapter, MenuItem menuItem, View view) {
            Log_OC.getArray(navigationListViewAdapter, "this$0");
            Log_OC.getArray(menuItem, "$menuItem");
            InterfaceC11767l $r1 = navigationListViewAdapter.getListener();
            if ($r1 == null) {
                return;
            }
            $r1.invoke(menuItem);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void bind(final MenuItem menuItem) {
            Log_OC.getArray(menuItem, "menuItem");
            NavMenuListItemBinding $r3 = this.binding;
            TextView $r4 = $r3.itemTitle;
            String $r5 = menuItem.getItemName();
            $r4.setText($r5);
            NavMenuListItemBinding $r32 = this.binding;
            ImageView $r6 = $r32.itemIcon;
            int $i0 = menuItem.getItemIcon();
            $r6.setImageResource($i0);
            NavMenuListItemBinding $r33 = this.binding;
            TextView $r7 = $r33.itemNewFeatureBadge;
            boolean $z0 = menuItem.isNewFeature();
            byte $b1 = $z0 ? (byte) 0 : (byte) 8;
            TextView $r42 = $r7;
            $r42.setVisibility($b1);
            NavMenuListItemBinding $r34 = this.binding;
            ViewGroup $r8 = $r34.getRoot();
            MenuItem.State $r9 = menuItem.getState();
            MenuItem.State $r2 = MenuItem.State.LOADING;
            float $f0 = $r9 == $r2 ? 0.3f : 1.0f;
            ViewGroup r15 = $r8;
            r15.setAlpha($f0);
            boolean $z02 = menuItem.isSelected();
            if ($z02) {
                NavMenuListItemBinding $r35 = this.binding;
                ViewGroup $r82 = $r35.getRoot();
                NavigationListViewAdapter $r10 = this.this$0;
                Context $r11 = $r10.context;
                Drawable $r12 = ContextExtKt.getKudiDrawable($r11, C0001R.C0002drawable.background_nav_item);
                ViewGroup r152 = $r82;
                r152.setBackground($r12);
            } else {
                NavMenuListItemBinding $r36 = this.binding;
                ViewGroup $r83 = $r36.getRoot();
                ViewGroup r153 = $r83;
                r153.setBackgroundColor(0);
            }
            NavMenuListItemBinding $r37 = this.binding;
            ViewGroup $r84 = $r37.getRoot();
            final NavigationListViewAdapter $r102 = this.this$0;
            ViewGroup r154 = $r84;
            r154.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.home.adapter.d
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NavigationListViewAdapter $r22 = NavigationListViewAdapter.this;
                    NavigationListViewAdapter.MenuItem $r38 = menuItem;
                    NavigationListViewAdapter.NavigationViewHolder.m39327bind$lambda0($r22, $r38, view);
                }
            });
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final NavMenuListItemBinding getBinding() {
            NavMenuListItemBinding r1 = this.binding;
            return r1;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Type inference failed for: r2v0, types: [ai.kudi.agent.home.adapter.NavigationListViewAdapter$Companion$DIFF_CALLBACK$1] */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
        DIFF_CALLBACK = new C1713j.AbstractC1719f<MenuItem>() { // from class: ai.kudi.agent.home.adapter.NavigationListViewAdapter$Companion$DIFF_CALLBACK$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: areContentsTheSame  reason: avoid collision after fix types in other method */
            public boolean areContentsTheSame2(NavigationListViewAdapter.MenuItem menuItem, NavigationListViewAdapter.MenuItem menuItem2) {
                Log_OC.getArray(menuItem, "oldItem");
                Log_OC.getArray(menuItem2, "newItem");
                boolean $z0 = Log_OC.append(menuItem, menuItem2);
                String $r4 = Log_OC.m10359a("old Item ", menuItem);
                Object[] $r1 = new Object[0];
                Timber.wtf($r4, $r1);
                String $r42 = Log_OC.m10359a("new Item ", menuItem2);
                Object[] $r12 = new Object[0];
                Timber.wtf($r42, $r12);
                Boolean $r5 = Boolean.valueOf($z0);
                String $r43 = Log_OC.m10359a("contents same ", $r5);
                Object[] $r13 = new Object[0];
                Timber.wtf($r43, $r13);
                return $z0;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.recyclerview.widget.C1713j.AbstractC1719f
            public /* bridge */ /* synthetic */ boolean areContentsTheSame(NavigationListViewAdapter.MenuItem menuItem, NavigationListViewAdapter.MenuItem menuItem2) {
                NavigationListViewAdapter.MenuItem $r3 = menuItem;
                NavigationListViewAdapter.MenuItem $r4 = menuItem2;
                boolean $z0 = areContentsTheSame2($r3, $r4);
                return $z0;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: areItemsTheSame  reason: avoid collision after fix types in other method */
            public boolean areItemsTheSame2(NavigationListViewAdapter.MenuItem menuItem, NavigationListViewAdapter.MenuItem menuItem2) {
                Log_OC.getArray(menuItem, "oldItem");
                Log_OC.getArray(menuItem2, "newItem");
                String $r3 = menuItem.getKey();
                String $r4 = menuItem2.getKey();
                boolean $z0 = Log_OC.append($r3, $r4);
                return $z0;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.recyclerview.widget.C1713j.AbstractC1719f
            public /* bridge */ /* synthetic */ boolean areItemsTheSame(NavigationListViewAdapter.MenuItem menuItem, NavigationListViewAdapter.MenuItem menuItem2) {
                NavigationListViewAdapter.MenuItem $r3 = menuItem;
                NavigationListViewAdapter.MenuItem $r4 = menuItem2;
                boolean $z0 = areItemsTheSame2($r3, $r4);
                return $z0;
            }
        };
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Incorrect condition in loop: B:19:0x033b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NavigationListViewAdapter(android.content.Context r31, java.lang.String r32, android.content.SharedPreferences r33) {
        /*
            Method dump skipped, instructions count: 870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.home.adapter.NavigationListViewAdapter.<init>(android.content.Context, java.lang.String, android.content.SharedPreferences):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean shouldAddMenu(MenuItem menuItem) {
        String $r2 = this.customerType;
        int $i0 = $r2.hashCode();
        if ($i0 == 2614219) {
            boolean $z0 = $r2.equals("USER");
            if ($z0) {
                MenuItem.UserType $r3 = menuItem.getMenuType();
                MenuItem.UserType $r4 = MenuItem.UserType.AUTO;
                if ($r3 != $r4) {
                    MenuItem.UserType $r32 = menuItem.getMenuType();
                    MenuItem.UserType $r42 = MenuItem.UserType.USER;
                    return $r32 == $r42;
                }
                return true;
            }
            return true;
        }
        if ($i0 == 62212837) {
            boolean $z02 = $r2.equals("AGENT");
            if (!$z02) {
                return true;
            }
        } else if ($i0 != 277330376) {
            return true;
        } else {
            boolean $z03 = $r2.equals(HomeActivity.MERCHANT);
            if (!$z03) {
                return true;
            }
        }
        MenuItem.UserType $r33 = menuItem.getMenuType();
        MenuItem.UserType $r43 = MenuItem.UserType.AUTO;
        if ($r33 != $r43) {
            MenuItem.UserType $r34 = menuItem.getMenuType();
            MenuItem.UserType $r44 = MenuItem.UserType.AGENT;
            return $r34 == $r44;
        }
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void addMenuItem(MenuItem menuItem) {
        Log_OC.getArray(menuItem, "menuItem");
        boolean $z0 = shouldAddMenu(menuItem);
        if ($z0) {
            List $r2 = this.arrayOfMenuItem;
            $r2.add(menuItem);
        }
        List $r22 = this.arrayOfMenuItem;
        submitList($r22);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getArrayOfMenuItem() {
        List r1 = this.arrayOfMenuItem;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC11767l getListener() {
        InterfaceC11767l r1 = this.listener;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ArrayList getMenuItems() {
        ArrayList r1 = this.menuItems;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onBindViewHolder(NavigationViewHolder navigationViewHolder, int i) {
        Log_OC.getArray(navigationViewHolder, "holder");
        Object $r2 = getItem(i);
        Log_OC.loadImage($r2, "getItem(position)");
        MenuItem $r3 = (MenuItem) $r2;
        navigationViewHolder.bind($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.AbstractC1620e0 abstractC1620e0, int i) {
        NavigationViewHolder $r2 = (NavigationViewHolder) abstractC1620e0;
        onBindViewHolder($r2, i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public NavigationViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log_OC.getArray(viewGroup, "parent");
        Context $r3 = viewGroup.getContext();
        LayoutInflater $r4 = LayoutInflater.from($r3);
        NavMenuListItemBinding $r5 = NavMenuListItemBinding.inflate($r4, viewGroup, false);
        Log_OC.loadImage($r5, "inflate(\n                LayoutInflater.from(parent.context),\n                parent,\n                false\n            )");
        NavigationViewHolder $r2 = new NavigationViewHolder(this, $r5);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ RecyclerView.AbstractC1620e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        NavigationViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void removeMenuItem(MenuItem menuItem) {
        Log_OC.getArray(menuItem, "menuItem");
        List $r2 = this.arrayOfMenuItem;
        $r2.remove(menuItem);
        List $r22 = this.arrayOfMenuItem;
        submitList($r22);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:13:0x000f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void selectItem(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "selectedItem"
            kotlin.p483e0.p485d.Log_OC.getArray(r9, r0)
            java.util.List<ai.kudi.agent.home.adapter.NavigationListViewAdapter$MenuItem> r1 = r8.arrayOfMenuItem
            java.util.Iterator r2 = r1.iterator()
        Lb:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L25
            java.lang.Object r4 = r2.next()
            r6 = r4
            ai.kudi.agent.home.adapter.NavigationListViewAdapter$MenuItem r6 = (ai.kudi.agent.home.adapter.NavigationListViewAdapter.MenuItem) r6
            r5 = r6
            java.lang.String r7 = r5.getKey()
            boolean r3 = kotlin.p483e0.p485d.Log_OC.append(r9, r7)
            r5.setSelected(r3)
            goto Lb
        L25:
            java.util.List<ai.kudi.agent.home.adapter.NavigationListViewAdapter$MenuItem> r1 = r8.arrayOfMenuItem
            r8.submitList(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.home.adapter.NavigationListViewAdapter.selectItem(java.lang.String):void");
    }

    public final void setListener(InterfaceC11767l interfaceC11767l) {
        this.listener = interfaceC11767l;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void updateMenuList(MenuItem menuItem) {
        Log_OC.getArray(menuItem, "menuItem");
        boolean $z0 = shouldAddMenu(menuItem);
        if ($z0) {
            List $r2 = this.arrayOfMenuItem;
            int $i0 = 0;
            Iterator $r3 = $r2.iterator();
            while (true) {
                boolean $z02 = $r3.hasNext();
                if (!$z02) {
                    $i0 = -1;
                    break;
                }
                Object $r4 = $r3.next();
                MenuItem $r5 = (MenuItem) $r4;
                String $r6 = $r5.getKey();
                String $r7 = menuItem.getKey();
                boolean $z03 = Log_OC.append($r6, $r7);
                if ($z03) {
                    break;
                }
                $i0++;
            }
            $r2.set($i0, menuItem);
            notifyDataSetChanged();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void updateMenuListAtPosition(MenuItem menuItem, int i) {
        Log_OC.getArray(menuItem, "menuItem");
        boolean $z0 = shouldAddMenu(menuItem);
        if ($z0) {
            List $r2 = this.arrayOfMenuItem;
            $r2.add(i, menuItem);
        }
        List $r22 = this.arrayOfMenuItem;
        submitList($r22);
    }
}
