/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercato.Model;

/**
 *
 * @author PC-Yassine
 */
import java.util.Date;
import java.util.Objects;

public class User {

    private int userId;
    private String username;
    private String email;
    private String password;
    private String nom;
    private String prenom;
    private int hight;
    private int weight;
    private Date datenaissance;
    private String status;
    private String speciality;
    private String experience;
    private String paysnatal;
    private String role;
    private String job;
    private String sexe;
    private String lienProfilePic;
    private String positionSportif;
    private String lienMedia;
    private String lienCV;
    private String sponsorship;
    private int solde;
    
        public User() {
        this.password = "";
        this.username = "";
        this.email = "";
        this.nom = "";
        this.prenom = "";
        this.hight = 0;
        this.weight = 0;
        this.datenaissance = new Date();
        this.status = "";
        this.speciality = "";
        this.experience = "";
        this.paysnatal = "";
        this.role = "";
        this.job = "";
        this.sexe = "";
        this.lienProfilePic ="user.png";
        this.positionSportif = "";
        this.lienMedia = "";
        this.lienCV = "";
        this.sponsorship = "";
        this.solde = 0;
    }

    public User(int id, String username, String email, String password, String nom, String prenom, int hight, int weight, Date datenaissance, String status, String speciality, String experience, String paysnatal, String role, String job, String sexe, String lienProfilePic, String positionSportif, String lienMedia, String lienCV, String sponsorship) {
        this.userId = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.nom = nom;
        this.prenom = prenom;
        this.hight = hight;
        this.weight = weight;
        this.datenaissance = datenaissance;
        this.status = status;
        this.speciality = speciality;
        this.experience = experience;
        this.paysnatal = paysnatal;
        this.role = role;
        this.job = job;
        this.sexe = sexe;
        this.lienProfilePic = lienProfilePic;
        this.positionSportif = positionSportif;
        this.lienMedia = lienMedia;
        this.lienCV = lienCV;
        this.sponsorship = sponsorship;
    }

    public int getUserId() {
        return userId;
    }

    public String getSponsorship() {
        return sponsorship;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getHight() {
        return hight;
    }

    public int getWeight() {
        return weight;
    }

    public Date getDatenaissance() {
        return datenaissance;
    }

    public String getStatus() {
        return status;
    }

    public String getSpeciality() {
        return speciality;
    }

    public String getExperience() {
        return experience;
    }

    public String getPaysnatal() {
        return paysnatal;
    }

    public String getRole() {
        return role;
    }

    public String getJob() {
        return job;
    }

    public String getSexe() {
        return sexe;
    }

    public String getLienProfilePic() {
        return lienProfilePic;
    }

    public String getPositionSportif() {
        return positionSportif;
    }

    public String getLienMedia() {
        return lienMedia;
    }

    public String getLienCV() {
        return lienCV;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setSponsorship(String sponsorship) {
        this.sponsorship = sponsorship;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setDatenaissance(Date datenaissance) {
        this.datenaissance = datenaissance;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public void setPaysnatal(String paysnatal) {
        this.paysnatal = paysnatal;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void setLienProfilePic(String lienProfilePic) {
        this.lienProfilePic = lienProfilePic;
    }

    public void setPositionSportif(String positionSportif) {
        this.positionSportif = positionSportif;
    }

    public void setLienMedia(String lienMedia) {
        this.lienMedia = lienMedia;
    }

    public void setLienCV(String lienCV) {
        this.lienCV = lienCV;
    }

    public int getSolde() {
        return solde;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (this.userId != other.userId) {
            return false;
        }
        if (this.hight != other.hight) {
            return false;
        }
        if (this.weight != other.weight) {
            return false;
        }
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.prenom, other.prenom)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        if (!Objects.equals(this.speciality, other.speciality)) {
            return false;
        }
        if (!Objects.equals(this.experience, other.experience)) {
            return false;
        }
        if (!Objects.equals(this.paysnatal, other.paysnatal)) {
            return false;
        }
        if (!Objects.equals(this.role, other.role)) {
            return false;
        }
        if (!Objects.equals(this.job, other.job)) {
            return false;
        }
        if (!Objects.equals(this.sexe, other.sexe)) {
            return false;
        }
        if (!Objects.equals(this.lienProfilePic, other.lienProfilePic)) {
            return false;
        }
        if (!Objects.equals(this.positionSportif, other.positionSportif)) {
            return false;
        }
        if (!Objects.equals(this.lienMedia, other.lienMedia)) {
            return false;
        }
        if (!Objects.equals(this.lienCV, other.lienCV)) {
            return false;
        }
        if (!Objects.equals(this.datenaissance, other.datenaissance)) {
            return false;    
        }
        if (!Objects.equals(this.sponsorship, other.sponsorship)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "User{" + "userId=" + userId + ", username=" + username + ", email=" + email + ", password=" + password + ", nom=" + nom + ", prenom=" + prenom + ", hight=" + hight + ", weight=" + weight + ", datenaissance=" + datenaissance + ", status=" + status + ", speciality=" + speciality + ", experience=" + experience + ", paysnatal=" + paysnatal + ", role=" + role + ", job=" + job + ", sexe=" + sexe + ", lienProfilePic=" + lienProfilePic + ", positionSportif=" + positionSportif + ", lienMedia=" + lienMedia + ", lienCV=" + lienCV + '}';
    }
        
}