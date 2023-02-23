package ai.kudi.agent.login.domain.model;

import ai.kudi.agent.core.C0038R;
import ai.kudi.agent.pin.KudiPin;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13715n;
/* compiled from: AccountErrorType.kt */
@Metadata(m10422d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u000b\f\rB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&\u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, m10421d2 = {"Lai/kudi/agent/login/domain/model/AccountErrorType;", "Landroid/os/Parcelable;", "()V", "description", "", "resources", "Landroid/content/res/Resources;", "reasons", "", "tip", KudiPin.KUDI_PIN_TITLE, "BlackListed", "Blocked", "Suspended", "Lai/kudi/agent/login/domain/model/AccountErrorType$Blocked;", "Lai/kudi/agent/login/domain/model/AccountErrorType$Suspended;", "Lai/kudi/agent/login/domain/model/AccountErrorType$BlackListed;", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public abstract class AccountErrorType implements Parcelable {

    /* compiled from: AccountErrorType.kt */
    @Metadata(m10422d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001e\u0010\t\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\u00060\u00060\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004HÖ\u0001¨\u0006\u0013"}, m10421d2 = {"Lai/kudi/agent/login/domain/model/AccountErrorType$BlackListed;", "Lai/kudi/agent/login/domain/model/AccountErrorType;", "()V", "describeContents", "", "description", "", "resources", "Landroid/content/res/Resources;", "reasons", "", "kotlin.jvm.PlatformType", "tip", KudiPin.KUDI_PIN_TITLE, "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class BlackListed extends AccountErrorType {
        public static final Parcelable.Creator<BlackListed> CREATOR;
        public static final BlackListed INSTANCE;

        /* compiled from: AccountErrorType.kt */
        @Metadata(k = 3, m10420mv = {1, 5, 1}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Creator implements Parcelable.Creator<BlackListed> {
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BlackListed createFromParcel(Parcel parcel) {
                Log_OC.getArray(parcel, "parcel");
                parcel.readInt();
                BlackListed r2 = BlackListed.INSTANCE;
                return r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ BlackListed createFromParcel(Parcel parcel) {
                BlackListed $r1 = createFromParcel(parcel);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BlackListed[] newArray(int i) {
                BlackListed[] $r1 = new BlackListed[i];
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ BlackListed[] newArray(int i) {
                BlackListed[] $r1 = newArray(i);
                return $r1;
            }
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            BlackListed $r0 = new BlackListed();
            INSTANCE = $r0;
            Creator $r1 = new Creator();
            CREATOR = $r1;
        }

        private BlackListed() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.login.domain.model.AccountErrorType
        public String description(Resources resources) {
            Log_OC.getArray(resources, "resources");
            int $i0 = C0038R.string.account_blacklisted_status_description;
            String $r1 = resources.getString($i0);
            Log_OC.loadImage($r1, "resources.getString(R.string.account_blacklisted_status_description)");
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.login.domain.model.AccountErrorType
        public String getLocalizedName(Resources resources) {
            Log_OC.getArray(resources, "resources");
            int $i0 = C0038R.string.account_suspended_status_tip;
            String $r1 = resources.getString($i0);
            Log_OC.loadImage($r1, "resources.getString(R.string.account_suspended_status_tip)");
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.login.domain.model.AccountErrorType
        public List reasons(Resources resources) {
            List $r3;
            Log_OC.getArray(resources, "resources");
            int $i0 = C0038R.array.account_suspended_status_reasons;
            String[] $r2 = resources.getStringArray($i0);
            Log_OC.loadImage($r2, "resources.getStringArray(R.array.account_suspended_status_reasons)");
            $r3 = C13715n.m4025Z($r2);
            return $r3;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.login.domain.model.AccountErrorType
        public String title(Resources resources) {
            Log_OC.getArray(resources, "resources");
            int $i0 = C0038R.string.account_blacklisted_status_title;
            String $r1 = resources.getString($i0);
            Log_OC.loadImage($r1, "resources.getString(R.string.account_blacklisted_status_title)");
            return $r1;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            Log_OC.getArray(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* compiled from: AccountErrorType.kt */
    @Metadata(m10422d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001e\u0010\t\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\u00060\u00060\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004HÖ\u0001¨\u0006\u0013"}, m10421d2 = {"Lai/kudi/agent/login/domain/model/AccountErrorType$Blocked;", "Lai/kudi/agent/login/domain/model/AccountErrorType;", "()V", "describeContents", "", "description", "", "resources", "Landroid/content/res/Resources;", "reasons", "", "kotlin.jvm.PlatformType", "tip", KudiPin.KUDI_PIN_TITLE, "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Blocked extends AccountErrorType {
        public static final Parcelable.Creator<Blocked> CREATOR;
        public static final Blocked INSTANCE;

        /* compiled from: AccountErrorType.kt */
        @Metadata(k = 3, m10420mv = {1, 5, 1}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Creator implements Parcelable.Creator<Blocked> {
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Blocked createFromParcel(Parcel parcel) {
                Log_OC.getArray(parcel, "parcel");
                parcel.readInt();
                Blocked r2 = Blocked.INSTANCE;
                return r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Blocked createFromParcel(Parcel parcel) {
                Blocked $r1 = createFromParcel(parcel);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Blocked[] newArray(int i) {
                Blocked[] $r1 = new Blocked[i];
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Blocked[] newArray(int i) {
                Blocked[] $r1 = newArray(i);
                return $r1;
            }
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            Blocked $r0 = new Blocked();
            INSTANCE = $r0;
            Creator $r1 = new Creator();
            CREATOR = $r1;
        }

        private Blocked() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.login.domain.model.AccountErrorType
        public String description(Resources resources) {
            Log_OC.getArray(resources, "resources");
            int $i0 = C0038R.string.account_blocked_status_description;
            String $r1 = resources.getString($i0);
            Log_OC.loadImage($r1, "resources.getString(R.string.account_blocked_status_description)");
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.login.domain.model.AccountErrorType
        public String getLocalizedName(Resources resources) {
            Log_OC.getArray(resources, "resources");
            int $i0 = C0038R.string.account_blocked_status_tip;
            String $r1 = resources.getString($i0);
            Log_OC.loadImage($r1, "resources.getString(R.string.account_blocked_status_tip)");
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.login.domain.model.AccountErrorType
        public List reasons(Resources resources) {
            List $r3;
            Log_OC.getArray(resources, "resources");
            int $i0 = C0038R.array.account_blocked_status_reasons;
            String[] $r2 = resources.getStringArray($i0);
            Log_OC.loadImage($r2, "resources.getStringArray(R.array.account_blocked_status_reasons)");
            $r3 = C13715n.m4025Z($r2);
            return $r3;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.login.domain.model.AccountErrorType
        public String title(Resources resources) {
            Log_OC.getArray(resources, "resources");
            int $i0 = C0038R.string.account_blocked_status_title;
            String $r1 = resources.getString($i0);
            Log_OC.loadImage($r1, "resources.getString(R.string.account_blocked_status_title)");
            return $r1;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            Log_OC.getArray(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* compiled from: AccountErrorType.kt */
    @Metadata(m10422d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001e\u0010\t\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\u00060\u00060\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004HÖ\u0001¨\u0006\u0013"}, m10421d2 = {"Lai/kudi/agent/login/domain/model/AccountErrorType$Suspended;", "Lai/kudi/agent/login/domain/model/AccountErrorType;", "()V", "describeContents", "", "description", "", "resources", "Landroid/content/res/Resources;", "reasons", "", "kotlin.jvm.PlatformType", "tip", KudiPin.KUDI_PIN_TITLE, "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Suspended extends AccountErrorType {
        public static final Parcelable.Creator<Suspended> CREATOR;
        public static final Suspended INSTANCE;

        /* compiled from: AccountErrorType.kt */
        @Metadata(k = 3, m10420mv = {1, 5, 1}, xi = 48)
        /* loaded from: classes.dex */
        public static final class Creator implements Parcelable.Creator<Suspended> {
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Suspended createFromParcel(Parcel parcel) {
                Log_OC.getArray(parcel, "parcel");
                parcel.readInt();
                Suspended r2 = Suspended.INSTANCE;
                return r2;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Suspended createFromParcel(Parcel parcel) {
                Suspended $r1 = createFromParcel(parcel);
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Suspended[] newArray(int i) {
                Suspended[] $r1 = new Suspended[i];
                return $r1;
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Suspended[] newArray(int i) {
                Suspended[] $r1 = newArray(i);
                return $r1;
            }
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            Suspended $r0 = new Suspended();
            INSTANCE = $r0;
            Creator $r1 = new Creator();
            CREATOR = $r1;
        }

        private Suspended() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.login.domain.model.AccountErrorType
        public String description(Resources resources) {
            Log_OC.getArray(resources, "resources");
            int $i0 = C0038R.string.account_suspended_status_description;
            String $r1 = resources.getString($i0);
            Log_OC.loadImage($r1, "resources.getString(R.string.account_suspended_status_description)");
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.login.domain.model.AccountErrorType
        public String getLocalizedName(Resources resources) {
            Log_OC.getArray(resources, "resources");
            int $i0 = C0038R.string.account_suspended_status_tip;
            String $r1 = resources.getString($i0);
            Log_OC.loadImage($r1, "resources.getString(R.string.account_suspended_status_tip)");
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.login.domain.model.AccountErrorType
        public List reasons(Resources resources) {
            List $r3;
            Log_OC.getArray(resources, "resources");
            int $i0 = C0038R.array.account_suspended_status_reasons;
            String[] $r2 = resources.getStringArray($i0);
            Log_OC.loadImage($r2, "resources.getStringArray(R.array.account_suspended_status_reasons)");
            $r3 = C13715n.m4025Z($r2);
            return $r3;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.login.domain.model.AccountErrorType
        public String title(Resources resources) {
            Log_OC.getArray(resources, "resources");
            int $i0 = C0038R.string.account_suspended_status_title;
            String $r1 = resources.getString($i0);
            Log_OC.loadImage($r1, "resources.getString(R.string.account_suspended_status_title)");
            return $r1;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            Log_OC.getArray(parcel, "out");
            parcel.writeInt(1);
        }
    }

    private AccountErrorType() {
    }

    public /* synthetic */ AccountErrorType(DBUtils$1 dBUtils$1) {
        this();
    }

    public abstract String description(Resources resources);

    public abstract String getLocalizedName(Resources resources);

    public abstract List reasons(Resources resources);

    public abstract String title(Resources resources);
}
