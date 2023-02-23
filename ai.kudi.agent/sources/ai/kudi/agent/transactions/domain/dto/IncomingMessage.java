package ai.kudi.agent.transactions.domain.dto;

import ai.kudi.agent.notification.viewmodels.NotificationType;
import com.google.gson.C6784f;
import java.util.List;
/* loaded from: classes.dex */
public class IncomingMessage {
    public static final String TYPE_KYC_UPGRADE_FAILED = "KYC_UPGRADE_FAILED";
    public static final String TYPE_KYC_UPGRADE_SUCCESSFUL = "KYC_UPGRADE_SUCCESSFUL";
    public static final String TYPE_NOTIFICATION = "notification";
    public static final String TYPE_OUTLET_LINKING_REQUEST = "OUTLET_LINKING";
    public static final String TYPE_OUTLET_LINK_ACCEPTED = "OUTLET_LINK_ACCEPTED";
    public static final String TYPE_P2P_TRANSACTION = "transaction";
    public static final String TYPE_PENDING_FRAUD_CHECK = "PENDING_FRAUD_CHECK";
    public static final String TYPE_TERMINAL_DELIVERED = "TERMINAL_DELIVERED";
    public static final String TYPE_TICKET_STATUS;
    private final String mRef;
    private final String message;
    private final Meta meta;
    public List<String> options;
    private String source;
    private String source_id;
    private String status;
    private final String title;
    private final String type;

    /* loaded from: classes.dex */
    public static class Builder {
        private String message;
        private Meta meta;
        private List<String> options;
        private String request;
        private String source;
        private String source_id;
        private String title;
        private String type;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public IncomingMessage build() {
            String $r1 = this.type;
            String $r2 = this.message;
            String $r3 = this.request;
            String $r4 = this.title;
            List $r5 = this.options;
            Meta $r6 = this.meta;
            IncomingMessage $r7 = new IncomingMessage($r1, $r2, $r3, $r4, $r5, $r6);
            String $r12 = this.source;
            $r7.source = $r12;
            String $r13 = this.source_id;
            $r7.source_id = $r13;
            return $r7;
        }

        public Builder setMessage(String str) {
            this.message = str;
            return this;
        }

        public Builder setMeta(Meta meta) {
            this.meta = meta;
            return this;
        }

        public Builder setRef(String str) {
            this.request = str;
            return this;
        }

        public Builder setSource(String str) {
            this.source = str;
            return this;
        }

        public Builder setTitle(String str) {
            this.title = str;
            return this;
        }

        public Builder setType(String str) {
            this.type = str;
            return this;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        NotificationType $r1 = NotificationType.TICKET_NOTIFICATION;
        String $r0 = $r1.toString();
        TYPE_TICKET_STATUS = $r0;
    }

    public IncomingMessage(String str, String str2, String str3, String str4, List list, Meta meta) {
        this.type = str;
        this.message = str2;
        this.options = list;
        this.title = str4;
        this.mRef = str3;
        this.meta = meta;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String getMessage() {
        String r1 = this.message;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Meta getMeta() {
        Meta r1 = this.meta;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public List getOptions() {
        List r1 = this.options;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String getRef() {
        String r1 = this.mRef;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String getSource() {
        String r1 = this.source;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String getStatus() {
        String r1 = this.status;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String getTitle() {
        String r1 = this.title;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String getType() {
        String r1 = this.type;
        return r1;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        C6784f $r2 = new C6784f();
        String $r1 = $r2.m20750v(this, IncomingMessage.class);
        return $r1;
    }
}
