<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Search</title>
    <style><%@include file="/css/index.css"%></style>
</head>
<body>


<div class="left_container"></div>
<div class="right_container"></div>
<!-- ===== STRIPS ===== -->
<div class="strips">
    <div class="left_strip"></div>
    <div class="right_strip"></div>
</div>


<div align="center" class="login_url">
    <h2> Symptom searched:-${login.symptom} </h2><br>
    <c:set var = "symptom" value="${login.symptom}"/>
    <c:choose>

        <c:when test = "${symptom.equalsIgnoreCase('Cough')}">
            <h4>You may be suffering from cold.</h4><br>
            <h5><u>Description</u>: "Colds are very common and widespread and most cases are caused by a virus.  Treatment with antibiotics is not advisable, as antibiotics are ineffective against viruses."</h5><br>
            <h5><u>Medical Condition</u>: "Colds are widespread and usually occur in colder seasons.  Colds typically start with a slowly developing sore throat, pain when swallowing, a runny nose, dry cough, mild headaches, exhaustion, joint pain, and a mild fever.  The illness usually lasts for a weeks and then slowly disappears, sometimes with a lingering cough."</h5><br>
            <h5><u>Treatment</u>: "A cold usually runs its course without lasting harm and then disappears on its own.  Rarely it is the start of a serious infection such as a lung infection.  Just as with the flu, bed rest and sufficient hydration are recommended.  It necessary, fever reducing medication can be taken.  Anti-inflammatory nasal sprays and inhalants can provide additional relief.  Although an exception to the rule, a bacterial infection may be present alongside a viral infection, in which case a doctor can prescribe an antibiotic."</h5>
        </c:when>

        <c:when test = "${symptom.equalsIgnoreCase('Fever')}">
            <h4>You may be suffering from a flu.</h4><br>
            <h5><u>Description</u>: "Flu, also known as influenza, is a viral infection of the nose, sinuses, throat, and respiratory tract.  It?s seasonal, often occurring in winter, and can spread rapidly, called then flu epidemic."</h5><br>
            <h5><u>Medical Condition</u>: "When the infection occurs in healthy young people, it is usually not dangerous and lasts around one or two weeks.  In some cases a dry cough may develop and last a bit longer.  Elderly and those with pre-existing illnesses have a higher risk for complications.  For this reason it?s recommended that these groups get vaccinated.  Swine and bird flus are caused by slight different influenza viruses, but causing similar symptoms.  Flu typically develops rapidly, with fever (sometimes accompanied with chills), muscle pain, headache, a dry and painful cough,  sore throat, and exhaustion or fatigue.  It's important to note that the flu is different from the common cold, which is often also caused by a virus, but causes milder symptoms."</h5><br>
            <h5><u>Treatment</u>: "Even today flu can have fatal consequences for those with pre-existing conditions and requires a hospital stay with emergency medical measures.  Normally it is self-limited and the body recovers by itself.  A doctor may prescribe medication to help shorten the course of the flu if taken early.  Bed rest and staying hydrated are usually sufficient.  Medications such as Ibuprofen or Aspirin can lower a fever and relieve symptoms, but they will not shorten the course of the illness and should be used in children with caution.  Flu vaccine is recommended for the following groups at risk:  nursing infants, people over 60, people with compromised immune systems, and pregnant women."</h5>
        </c:when>

        <c:when test = "${symptom.equalsIgnoreCase('Headache')}">
            <h5><u>Description</u>: "Headaches, along with back pain, are one of the most common health-related discomforts in the population.  The occurrence of headaches is very variable.  More than 90% of all headaches are primary, meaning that the pain itself is the disease and even modern imaging investigations have failed to find a cause for them.  The most common examples are the tension headaches, migraines, and headaches associate with medication.  Cluster headaches are less common."</h5><br>
            <h5><u>Medical Condition</u>: "Tension headaches generally affect the entire head, are weak-to-mildly strong, and are characterized by a pulling or pushing sensation.  They can last up to a week and exercise will not alleviate them.  Migraines on the other hand typically are on one side, pulsating, intense, and are made worse by activity.  Additionally, they can be accompanied by nausea and impaired vision and sense of touch (see separate article on migraines).Cluster headaches are intense attacks on one side and usually occur during sleep and can be accompanied by a red, tearing eye."</h5><br>
            <h5><u>Treatment</u>: "Because the cause of primary headaches is unknown, treatment tends to be aimed at alleviating the headache with painkillers.  Therapy with oxygen is advisable for cluster headaches.  Generally, known triggers for headaches should be avoided or diminished with medication."</h5>
        </c:when>

        <c:when test = "${symptom.equalsIgnoreCase('Sore throat')} ">
            <h5><u>Description</u>: "A sore throat, also known as pharyngitis, in an inflammation of the throat?s mucus membrane and is often expressed as soreness in the throat, difficulties swallowing, and occasionally fever."</h5><br>
            <h5><u>Medical Condition</u>: "Pharyngitis is widespread and predominantly affects children.  The majority of cases are due to flu-like infections that are caused by viruses.  Bacteria can also cause throat infections, though this is not as common.  Patients suffer from itching or pain in the throat, difficulties swallowing, coughing, and bad breath.  Patients may also don?t feel well or develop fever."</h5><br>
            <h5><u>Treatment</u>: "Antibiotics are not effective against flu-like viral infections and treatment consists of relieving the patient of ailments by providing sufficient hydration (warm tea, for example), as well as the use of troches or sprays that reduce pain and inflammation.  If bacteria are found to be the cause for the infection, then antibiotics are necessary."</h5>
        </c:when>

        <c:when test = "${symptom.equalsIgnoreCase('Vomiting') }">
            <h4>You may be suffering from food poisoning.</h4><br>
            <h5><u>Description</u>: "Technically, foodborne diseases are not an infection but the intestine's reaction to toxins produces by bacteria in spoilt food. Dairy and egg products, meat and potato salad are examples for food that spoils fast. Enterotoxinogenic bacteria are most commonly staphylococcus aureus, and sometimes bacillus cereus or clostridium perfringens. The toxin of staphylococcus aureus, which frequently causes foodborne diseases, is heat resistant. That means that even by heating up spoilt food to 100°C for more than 30 minutes do not destroy those toxins, so that they can cause nausea, vomiting and diarrhoea after eating."</h5><br>
            <h5><u>Medical Condition</u>: "Characteristic for foodborne diseases are the typical symptoms within 1 to 16 hours after eating the spoilt food. Usually all persons who consumed the food will suffer from nausea, vomiting and diarrhoea, often accompanied by cramp-like stomach pains. The symptoms usually occur within few hours after consuming the affected food. With the exception of the very rare botulism, patients fully recover without any long-term consequences."</h5><br>
            <h5><u>Treatment</u>: "The typical symptoms described by all persons who consumed the affected food within 1 to 16 hours point to foodborne disease. Nonetheless, an infection, e.g. salmonella or norovirus should be taken into consideration as well. In cases of doubt, the enterotoxins can often be established in the spoilt food. The symptoms typically last for 1 to 2 days. Therapy is purely for the symptoms. Most important is the replacement of liquids and salts, and in some cases antispasmodic medication. Especially older patients or children may require in-patient treatment with infusions, to regulate the liquid- and salt balance. Generally it is important to make sure that foods bought or consumed are fresh and not spoilt. It is also important to know that even heating up foods can't remove certain bacterial toxins."</h5>
        </c:when>

        <c:when test = "${symptom.equalsIgnoreCase('Back pain') }">
            <h4>You may be suffering from slipped disc.</h4><br>
            <h5><u>Description</u>: "A herniated disc (also known as a slipped disc or spinal disc herniation) is when a disc bulges out between the vertebrae of the spinal cord and presses against the spinal cord nerve.  Spinal discs lose elasticity with age and can tear with sudden, awkward movements while carrying heavy loads (e.g. lifting heavy weights with a bent back) and then bulge out into the spinal canal.  This compresses the spinal nerve root.  The lumbar vertebrae are usually the ones affected (technically known at L5/S1, L4/L5)"</h5><br>
            <h5><u>Medical Condition</u>: "Patients usually feel pain in the lumbar vertebrae after a clumsy movement.  The pain then spreads to the buttocks, then the upper thigh, and can even radiate down the entire leg.  In serious cases, patients may experience lack of sensation or even paralysis."</h5><br>
            <h5><u>Treatment</u>: "After having the herniated disc confirmed through special imaging (MRI, magnetic resonance imaging), pain medication and bed rest can help to reduce pain.  Heat therapy and massage can also help to loosen up the muscles around the herniated disc.  To prevent recurrence, behavioral training (\"back school\") is recommended. In more severe cases, where a sense of failure or even paralysis is present, surgery is required."</h5>
        </c:when>

        <c:otherwise>
            <h5> Please enter a different SYMPTOM </h5>
        </c:otherwise>
    </c:choose>
    <br>
    <br>
    <p> <span style="color:purple;font-weight:bold">The following details are sent to your E-mail address </span> </p>

</div>


<p><a class="login_button" href="login">Logout</a></p>
<p><a class="home_button" href="profile">Profile</a></p>


</body>
</html>
