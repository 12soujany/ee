	package com.persistancelayer;
// this spical interface because it extending jpa repo 
import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
// instaed pf serlizable we can can take retrun type primary key mapped one vairble datatype but its integer
//-- but we take serlizable because its adopt for all datatype
public interface ContactDtlsRepository extends JpaRepository<ContactdetlsEntity, Serializable>{
// here no need to mention@jparepo beacuse we are extending jparepo at runtine it will add jparepo proxy class
// this inreface is key for curd oprtions so it as lots of method retirve data dn find delete one and delte all so we can use 
	//--this method when ever need in curd oprtions and no need to create any Implemantion class for this inteface 
	// -- it will createn proxy impl class at run time when app starts 
}
