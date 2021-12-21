package com.techoffice.Services.dto.generic;


import java.util.ArrayList;
import java.util.List;

public class UserData {
    
        private static final long serialVersionUID = 7969130770008962500L;
        
        private String firstName;
        private String lastName;
        private String userName;
        private long userId;
        private long delegateUserId;
        private boolean president;
        private String expiredFlag;
        private String expiryDate;
        private String roleName;
        private String jobName;
        private long entityId;
        private long parentEntityId;
        private String parentEntityName;
        private long entitySpecialization;
        private boolean delegate;
        private boolean removeSignature;
        private String entityName;
        private long originalUserId;
        private long originalEntityId;
        private long originalEntitySpecialization;
        private long originalUserRole;
        private long investigationCode;

        private int jobId;
        private int userRoleId;
        private int delegateRoleId;

       
        private boolean investigator;
        private boolean leader;

        private String password;
        
        private String originalUsername;
        private String delegateCode;
        protected String nidUserId;
        protected String nidChannelId;
        protected String nidTokenId;
        protected String nidCallPermission;
        private String menuData;
        
        

        public void setEntityName(String entityName) {
            this.entityName = entityName;
        }

        public String getEntityName() {
            return entityName;
        }

        public void setDelegateUserId(long delegateUserId) {
            this.delegateUserId = delegateUserId;
        }

        public long getDelegateUserId() {
            return delegateUserId;
        }

        public void setRemoveSignature(boolean removeSignature) {
            this.removeSignature = removeSignature;
        }

        public boolean isRemoveSignature() {
            return removeSignature;
        }

        public void setDelegateCode(String delegateCode) {
            this.delegateCode = delegateCode;
        }

        public String getDelegateCode() {
            return delegateCode;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getPassword() {
            return password;
        }

        public void setNidUserId(String nidUserId) {
            this.nidUserId = nidUserId;
        }

        public String getNidUserId() {
            return nidUserId;
        }

        public void setNidChannelId(String nidChannelId) {
            this.nidChannelId = nidChannelId;
        }

        public String getNidChannelId() {
            return nidChannelId;
        }

        public void setNidTokenId(String nidTokenId) {
            this.nidTokenId = nidTokenId;
        }

        public String getNidTokenId() {
            return nidTokenId;
        }

        public void setNidCallPermission(String nidCallPermission) {
            this.nidCallPermission = nidCallPermission;
        }

        public String getNidCallPermission() {
            return nidCallPermission;
        }

        public void setMenuData(String menuData) {
            this.menuData = menuData;
        }

        public String getMenuData() {
            return menuData;
        }

        public void setJobId(int jobId) {
            this.jobId = jobId;
        }

        public int getJobId() {
            return jobId;
        }

        public void setOriginalUserRole(long originalUserRole) {
            this.originalUserRole = originalUserRole;
        }

        public long getOriginalUserRole() {
            return originalUserRole;
        }

        public void setOriginalEntityId(long originalEntityId) {
            this.originalEntityId = originalEntityId;
        }

        public long getOriginalEntityId() {
            return originalEntityId;
        }

        public void setOriginalEntitySpecialization(long originalEntitySpecialization) {
            this.originalEntitySpecialization = originalEntitySpecialization;
        }

        public long getOriginalEntitySpecialization() {
            return originalEntitySpecialization;
        }

        public void setOriginalUserId(long originalUserId) {
            this.originalUserId = originalUserId;
        }

        public long getOriginalUserId() {
            return originalUserId;
        }

        public void setOriginalUsername(String originalUsername) {
            this.originalUsername = originalUsername;
        }

        public String getOriginalUsername() {
            return originalUsername;
        }

        public void setDelegate(boolean delegate) {
            this.delegate = delegate;
        }

        public boolean isDelegate() {
            return delegate;
        }


      

        public void setLeader(boolean leader) {
            this.leader = leader;
        }

        public boolean isLeader() {
            return leader;
        }

        public void setPresident(boolean president) {
            this.president = president;
        }

        public boolean isPresident() {
            return president;
        }

        public void setUserId(long userId) {
            this.userId = userId;
        }

        public long getUserId() {
            return userId;
        }


        public void setUserRoleId(int userRoleId) {
            this.userRoleId = userRoleId;
        }

        public int getUserRoleId() {
            return userRoleId;
        }
       


        public void setDelegateRoleId(int delegateRoleId) {
            this.delegateRoleId = delegateRoleId;
        }

        public int getDelegateRoleId() {
            return delegateRoleId;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getUserName() {
            return userName;
        }

        public void setExpiredFlag(String expiredFlag) {
            this.expiredFlag = expiredFlag;
        }

        public String isExpiredFlag() {
            return expiredFlag;
        }

        public String getExpiredFlag() {
            return expiredFlag;
        }


        public void setExpiryDate(String expiryDate) {
            this.expiryDate = expiryDate;
        }

        public String getExpiryDate() {
            return expiryDate;
        }

        public UserData() {
            super();
        }

        public long getEntityId() {
            return entityId;
        }

        public void setEntityId(long entityId) {
            this.entityId = entityId;
        }


        public void setEntitySpecialization(long entitySpecialization) {
            this.entitySpecialization = entitySpecialization;
        }

        public long getEntitySpecialization() {
            return entitySpecialization;
        }

        public void setInvestigationCode(long investigationCode) {
            this.investigationCode = investigationCode;
        }

        public long getInvestigationCode() {
            return investigationCode;
        }

        public void setRoleName(String roleName) {
            this.roleName = roleName;
        }

        public String getRoleName() {
            return roleName;
        }

        public void setJobName(String jobName) {
            this.jobName = jobName;
        }

        public String getJobName() {
            return jobName;
        }

        public void setInvestigator(boolean investigator) {
            this.investigator = investigator;
        }

        public boolean isInvestigator() {
            return investigator;
        }

        public void setParentEntityId(long parentEntityId) {
            this.parentEntityId = parentEntityId;
        }

        public long getParentEntityId() {
            return parentEntityId;
        }

        public void setParentEntityName(String parentEntityName) {
            this.parentEntityName = parentEntityName;
        }

        public String getParentEntityName() {
            return parentEntityName;
        }
}
