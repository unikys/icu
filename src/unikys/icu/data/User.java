package unikys.icu.data;

public class User {

	private String mId;
	private String mUuid;
	private String mNickname;
	private String mRegion;
	private String mSex;
	private String mAge;
	private UserPhoto mProfilePhoto;
	private String mPhoneNumber;
	private String mEmail;
	private String mPrivacy;
	private PrivacySettings mPersonalPrivacySettings;

	public String getId() {
		return mId;
	}
	public void setId(String id) {
		mId = id;
	}
	public String getUuid() {
		return mUuid;
	}
	public void setUuid(String uuid) {
		mUuid = uuid;
	}
	public String getNickname() {
		return mNickname;
	}
	public void setNickname(String nickname) {
		mNickname = nickname;
	}
	public String getRegion() {
		return mRegion;
	}
	public void setRegion(String region) {
		mRegion = region;
	}
	public String getSex() {
		return mSex;
	}
	public void setSex(String sex) {
		mSex = sex;
	}
	public String getAge() {
		return mAge;
	}
	public void setAge(String age) {
		mAge = age;
	}
	public UserPhoto getProfilePhoto() {
		return mProfilePhoto;
	}
	public void setProfilePhoto(UserPhoto profilePhoto) {
		mProfilePhoto = profilePhoto;
	}
	public String getPhoneNumber() {
		return mPhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		mPhoneNumber = phoneNumber;
	}
	public String getEmail() {
		return mEmail;
	}
	public void setEmail(String email) {
		mEmail = email;
	}
	public String getPrivacy() {
		return mPrivacy;
	}
	public void setPrivacy(String privacy) {
		mPrivacy = privacy;
	}
	public PrivacySettings getPersonalPrivacySettings() {
		return mPersonalPrivacySettings;
	}
	public void setPersonalPrivacySettings(PrivacySettings personalPrivacySettings) {
		mPersonalPrivacySettings = personalPrivacySettings;
	}
	
}
